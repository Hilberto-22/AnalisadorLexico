package AnalisadorLexicoSintatico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        
        initComponents();
        
        Lexico lexico = new Lexico();
        Sintatico sintatico = new Sintatico();
        Semantico semantico = new Semantico();
        
        Token token;
        
        int totalErrosLexicos = 0, totalErrosSintaticos = 0;
        String errosLexicos = "", errosSintaticos = "";
        
        int linhaAtual = 1;
        String allLines = "", allTokens = "";
        
        Path path;
        String address;
        List<String> file;
        
        address = JOptionPane.showInputDialog("Informe o caminho do arquivo"
                + " (incluindo nome e extensão)");
        
        if(address == null) return;
        
        path = Paths.get(address);
               
        try {
            
            file = Files.readAllLines(path);
            
            for (String line : file) {
                
                lexico.setInput(line);
                allLines += line;
                
                try {
                    while((token = lexico.nextToken()) != null){
                        allTokens += token.getLexeme() + " ";
                    }
                } catch (LexicalError ex) {
                    System.out.println(ex);
                }
                
                allLines += "\n";
                allTokens += "\n";
                linhaAtual++;
            }
            
        } catch (IOException e) {
            
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo\n\n" + e);
            return;
        }
        
        try {
            
            lexico.setInput(allLines);
            sintatico.parse(lexico, semantico);
            
        } catch (LexicalError e){
            
            totalErrosLexicos++;
            errosLexicos += e;
            errosLexicos += "\n";
            
        } catch (SyntaticError e) {
            
            totalErrosSintaticos++;
            errosSintaticos += e;
            errosSintaticos += "\n";
            
        } catch (SemanticError e) {
            // Erros semânticos
        }
        
        if(totalErrosLexicos == 0){
            jLabelAnaliseLexica.setText(jLabelAnaliseLexica.getText() + " - sem erros");
            jTextAreaAnaliseLexica.setText(allTokens);
        } else {
            jLabelAnaliseLexica.setText(jLabelAnaliseLexica.getText() + " - " + 
                    totalErrosLexicos + " erro(s) encontrado(s)");
            jTextAreaAnaliseLexica.setText(errosLexicos);
        }
        
        if(totalErrosSintaticos == 0){
            jLabelAnaliseSintatica.setText(jLabelAnaliseSintatica.getText() + " - sem erros");
            jTextAreaAnaliseSintatica.setText("Sem erros");
        } else {
            jLabelAnaliseSintatica.setText(jLabelAnaliseSintatica.getText() + " - " + 
                    totalErrosSintaticos + " erro(s) encontrado(s)");
            jTextAreaAnaliseSintatica.setText(errosSintaticos);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAnaliseLexica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAnaliseLexica = new javax.swing.JTextArea();
        jLabelAnaliseSintatica = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAnaliseSintatica = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analisador léxico e sintático");
        setResizable(false);

        jLabelAnaliseLexica.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelAnaliseLexica.setText("Análise léxica");

        jTextAreaAnaliseLexica.setEditable(false);
        jTextAreaAnaliseLexica.setColumns(1);
        jTextAreaAnaliseLexica.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextAreaAnaliseLexica.setRows(5);
        jTextAreaAnaliseLexica.setText("Erro ao abrir arquivo");
        jScrollPane1.setViewportView(jTextAreaAnaliseLexica);

        jLabelAnaliseSintatica.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelAnaliseSintatica.setText("Análise sintática");

        jTextAreaAnaliseSintatica.setEditable(false);
        jTextAreaAnaliseSintatica.setColumns(20);
        jTextAreaAnaliseSintatica.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextAreaAnaliseSintatica.setRows(5);
        jTextAreaAnaliseSintatica.setText("Erro ao abrir arquivo");
        jScrollPane2.setViewportView(jTextAreaAnaliseSintatica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAnaliseLexica)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelAnaliseSintatica))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAnaliseLexica)
                    .addComponent(jLabelAnaliseSintatica))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAnaliseLexica;
    private javax.swing.JLabel jLabelAnaliseSintatica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaAnaliseLexica;
    private javax.swing.JTextArea jTextAreaAnaliseSintatica;
    // End of variables declaration//GEN-END:variables
}