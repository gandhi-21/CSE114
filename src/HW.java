import java.io.*;
import java.util.Scanner;

public class HW {
    
    static String translateEmphasis(String input) {
        
        String emOpen = "<em> ", emClose = "</em>";
        String result = emOpen + input + emClose;
        
        return result;
    }
    
    static String translateStrongEmphasis(String input) {
        
        String strongOpen = "<strong> ", strongClose = "</strong>";
        String result = strongOpen + input + strongClose;
        
        return result;
    }
    
    static String translateHyperlink(String text, String link) {
        
        String aOpen = "<a href = \"", hrefClose = "\" > ", aClose = "</a>";
        String result = aOpen + link + hrefClose + text + aClose;
        
        return result;
    }
    
    static String translateImage(String altText, String link, String titleText) {
        
        String imgOpen = "<img src = \"", altOpen = "\" alt = \"", titleOpen = "\" title = \"", imgClose = "\">";
        String result = imgOpen + link.trim() + altOpen + altText + titleOpen + titleText + imgClose;
        
        return result;
    }
    
    static String translateCode(String input) {
        
        String codeOpen = "<code> ", codeClose = "</code>";
        String result = codeOpen + input + codeClose;
        
        return result;
    }
    
    static String translateListItem(String input) {
        
        String liOpen = "<li>", liClose = " </li>";
        String result = liOpen + input + liClose;
        
        return result;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEnter Name of input file : ");
        String inputFile = sc.nextLine();
        System.out.println("\nEnter Name of output file : ");
        String outputFile = sc.nextLine();
        
        sc.close();
        
        String line;
        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            File file = new File(outputFile);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            String boilerplate = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "<title>Results of Markdown Translation</title>\n" +
            "</head>\n" +
            "<body>\n";
            
            String closingTags = "</body>\n" +
            "</html>";
            bufferedWriter.write(boilerplate);
            
            boolean ulStart = Boolean.FALSE;
            while((line = bufferedReader.readLine()) != null) {
                
                if(ulStart == Boolean.TRUE) {
                    if(line.length() == 0 || line.charAt(0) != '+') {
                        ulStart = Boolean.FALSE;
                        bufferedWriter.write("</ul>");
                    }
                }
                
                if(line.length() == 0) {
                    bufferedWriter.write("<p>");
                    continue;
                }
                
                int len = line.length(), i = 0;
                int astCount = 0, quoteCount = 0, codeCount = 0, idx = 0;
                boolean start = Boolean.FALSE, imageStart = Boolean.FALSE;
                boolean linkStart = Boolean.FALSE, next = Boolean.TRUE;
                String link = "", text = "", title = "";
                int type = 0; // 0 = text, 1 = link, 2 = title
                
                while(i<len) {
                    
                    char ch = line.charAt(i);
                    boolean def = Boolean.TRUE;
                    
                    switch(ch) {
                        case '*':
                            start = Boolean.TRUE;
                            astCount++;
                            type = 0;
                            if(astCount == 2 && idx != 0) {
                                start = Boolean.FALSE;
                                astCount = 0;
                                idx = 0;
                                bufferedWriter.write(translateEmphasis(text));
                                text = "";
                            }
                            else if(astCount == 4) {
                                start = Boolean.FALSE;
                                astCount = 0;
                                idx = 0;
                                bufferedWriter.write(translateStrongEmphasis(text));
                                text = "";
                            }
                            def = Boolean.FALSE;
                            break;
                        case '[':
                            type = 0;
                            start = Boolean.TRUE;
                            linkStart = Boolean.TRUE;
                            def = Boolean.FALSE;
                            break;
                        case '(':
                            
                            if(linkStart == Boolean.TRUE) {
                                type = 1;
                                start = Boolean.TRUE;
                                def = Boolean.FALSE;
                            }
                            break;
                        case ']':
                            start = Boolean.FALSE;
                            idx = 0;
                            
                            if(i+1 >= len || line.charAt(i+1) != '(') {
                                bufferedWriter.write('[' + text + ']');
                                text = "";
                            }
                            def = Boolean.FALSE;
                            break;
                        case ')':
                            if(start == Boolean.TRUE) {
                                linkStart = Boolean.FALSE;
                                start = Boolean.FALSE;
                                idx = 0;
                                
                                if(imageStart == Boolean.FALSE) {
                                    bufferedWriter.write(translateHyperlink(text, link));
                                    text = "";
                                    link = "";
                                }
                                def = Boolean.FALSE;
                            }
                            if(next == Boolean.FALSE) {
                                def = Boolean.FALSE;
                                next = Boolean.TRUE;
                            }
                            break;
                        case '`':
                            codeCount++;
                            type = 0;
                            start = Boolean.TRUE;
                            
                            if(codeCount == 2) {
                                start = Boolean.FALSE;
                                codeCount = 0;
                                idx = 0;
                                bufferedWriter.write(translateCode(text));
                                text = "";
                            }
                            
                            def = Boolean.FALSE;
                            break;
                        case '+':
                            
                            if(ulStart == Boolean.FALSE) {
                                bufferedWriter.newLine();
                                bufferedWriter.write("<ul>");
                                bufferedWriter.newLine();
                                ulStart = Boolean.TRUE;
                            }
                            start = Boolean.TRUE;
                            type = 0;
                            idx = 0;
                            
                            def = Boolean.FALSE;
                            break;
                        case '\"':
                            if(imageStart == Boolean.TRUE) {
                                quoteCount++;
                                type = 2;
                                start = Boolean.TRUE;
                                if(quoteCount == 2) {
                                    start = Boolean.FALSE;
                                    idx = 0;
                                    quoteCount = 0;
                                    bufferedWriter.write(translateImage(text, link, title));
                                    text = "";
                                    link = "";
                                    title = "";
                                }
                                def = Boolean.FALSE;
                                next = Boolean.FALSE;
                            }
                            break;
                            
                        case '!':
                            if(i+1 < len && line.charAt(i+1) == '[') {
                                imageStart = Boolean.TRUE;
                                def = Boolean.FALSE;
                                break;
                            }
                            
                    }
                    
                    if(def) {
                        if(start == Boolean.FALSE) {
                            bufferedWriter.write(ch);
                        }
                        else {
                            
                            switch(type) {
                                case 0:
                                    text += Character.toString(ch);
                                    break;
                                case 1:
                                    link += Character.toString(ch);
                                    break;
                                case 2:
                                    title += Character.toString(ch);
                                    break;
                            }
                            
                            if(ulStart == Boolean.TRUE && i+1 == len) {
                                start = Boolean.FALSE;
                                bufferedWriter.write(translateListItem(text));
                                bufferedWriter.newLine();
                                text = "";
                                idx = 0;
                            }
                            
                            
                            idx++;
                        }
                    }
                    
                    i++;
                }
                
                bufferedWriter.newLine();
                
            }
            
            if(ulStart == Boolean.TRUE) {
                ulStart = Boolean.FALSE;
                bufferedWriter.write("</ul>");
            }
            
            bufferedWriter.write(closingTags);
            bufferedReader.close();
            bufferedWriter.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + inputFile + "'. Not found.");
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
}

