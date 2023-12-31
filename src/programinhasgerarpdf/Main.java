/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programinhasgerarpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author Br
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //criamos um documento vazio
        Document documentoPDF = new Document();
        
        try{
            
            //cria uma instancia do documento e da o nome do pdf
            PdfWriter.getInstance(documentoPDF, new FileOutputStream("D:\\PDF_PROGRAMINHAS.pdf"));
            
            //abrir o documento
            documentoPDF.open();
            
            //setar o tamnho da página
            documentoPDF.setPageSize(PageSize.A4);
            
            //adicinando primeiro paragrafo
            documentoPDF.add(new Paragraph("GERANDO PDF COM PROGRAMINHAS E VOCE"));
            
            //nova pagina
            documentoPDF.newPage();
            
            //paragrafo da segunda pagina
            documentoPDF.add(new Paragraph("Parágrafo de teste da segunda página"));
            
            //imagem do relatorio
            Image imagem = Image.getInstance("D:\\imagens\\minhas\\brpig.jpg");
            
            //setar o tamanho da imagem
//            imagem.scaleToFit(400, 200);
            
            //adicionar a imagem ao pdf
            documentoPDF.add(imagem);
            
        }catch(DocumentException de){
            de.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally{
            documentoPDF.close();
        }
    }

}
