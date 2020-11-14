
/*********************************************************************
 * RandomBook.java
 *
 * This class recommends three random books to the user
 * @author  Pranav Kalsi
 * @since   2020-11-04
 ********************************************************************
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RandomBook extends javax.swing.JFrame {
    //field representing the customer object
    private Customer customer;

    //array storing line numbers of the three selected books
    int [] covers = new int [3];

    /**
     * Constructor Method
     */
    public RandomBook(Customer customer) {
        //set the field customer to the parameter passed in
        this.customer = new Customer(customer);

        //check if files needed exist
        if (isDataPresent()){
            //run autogenerated code
            initComponents();

            //run the algorithm to pick books
            algorithm();
        }else{
            //go to mainMenu Page
            new mainMenu(this.customer, false).setVisible(true);

            //set this invisible
            this.dispose();
        }//end if else
    }//end of constructor

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * This method creates all of the front end elements
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        title = new javax.swing.JLabel();
        bookCover3 = new javax.swing.JLabel();
        bookCover1 = new javax.swing.JLabel();
        bookCover2 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        author3 = new javax.swing.JLabel();
        author2 = new javax.swing.JLabel();
        author1 = new javax.swing.JLabel();
        gtb1 = new javax.swing.JButton();
        gtb2 = new javax.swing.JButton();
        gtb3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        logo = new javax.swing.JMenu();
        recMenu = new javax.swing.JMenu();
        menuMenu = new javax.swing.JMenu();
        browseMenu = new javax.swing.JMenu();
        ratedMenu = new javax.swing.JMenu();
        addMenu = new javax.swing.JMenu();
        friendsMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        title.setText("Random Books You May Like!");

        bookCover3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookCover3.setIcon(new javax.swing.ImageIcon("C:\\Users\\kalsi\\Documents\\NetBeansProjects\\Booksmart_App\\logo_Menu.png")); // NOI18N

        bookCover1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookCover1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kalsi\\Documents\\NetBeansProjects\\Booksmart_App\\logo_Menu.png")); // NOI18N

        bookCover2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookCover2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kalsi\\Documents\\NetBeansProjects\\Booksmart_App\\logo_Menu.png")); // NOI18N

        title2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Title PlaceHolder");

        title1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Title PlaceHolder");
        title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        title3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("Title PlaceHolder");

        author3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        author3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        author3.setText("Author Place Holder");

        author2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        author2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        author2.setText("Author Place Holder");

        author1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        author1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        author1.setText("Author Place Holder");

        gtb1.setText("Go to book!");
        gtb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtb1ActionPerformed(evt);
            }
        });

        gtb2.setText("Go to book!");
        gtb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtb2ActionPerformed(evt);
            }
        });

        gtb3.setText("Go to book!");
        gtb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtb3ActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\kalsi\\Documents\\NetBeansProjects\\Booksmart_App\\logo_Menu.png")); // NOI18N
        jMenuBar1.add(logo);

        recMenu.setText("Recommended");
        recMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        recMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(recMenu);

        menuMenu.setText("Main Menu");
        menuMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuMenu);

        browseMenu.setText("Browse");
        browseMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        browseMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(browseMenu);

        ratedMenu.setText("Book's You've Rated");
        ratedMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ratedMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ratedMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(ratedMenu);

        addMenu.setText("Add Books");
        addMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(addMenu);

        friendsMenu.setText("Friends");
        friendsMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        friendsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friendsMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(friendsMenu);
        
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookCover1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(author1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(author2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookCover2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(author3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(bookCover3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(gtb1)
                .addGap(191, 191, 191)
                .addComponent(gtb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gtb3)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bookCover1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookCover2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookCover3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title2)
                    .addComponent(title1)
                    .addComponent(title3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(author3)
                    .addComponent(author2)
                    .addComponent(author1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gtb1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(gtb2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, Short.MAX_VALUE)
                    .addComponent(gtb3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, Short.MAX_VALUE)))
        );

        pack();
    }// end of method initComponents

    /**
     * The button pressed action event to go to the book page
     * @param evt The mouse action event
     */
    private void gtb1ActionPerformed(java.awt.event.ActionEvent evt) {   
        //try catch to call the book page                                   
        try {
            new BookPage(title1.getText(), author1.getText(), covers[0]+1, this.customer).setVisible(true);        
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }//end try catch

        //set this page to invisible
        this.dispose();
    }//end of method gtb3ActionPerformed

    /**
     * The button pressed action event to go to the book page
     * @param evt The mouse action event
     */
    private void gtb2ActionPerformed(java.awt.event.ActionEvent evt) {   
        //try catch to call the book page                                   
        try {
            new BookPage(title2.getText(), author2.getText(), covers[1]+1, this.customer).setVisible(true);        
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }//end try catch

        //set this page to invisible
        this.dispose();
    }//end of method gtb3ActionPerformed

        /**
     * The button pressed action event to go to the book page
     * @param evt The mouse action event
     */
    private void gtb3ActionPerformed(java.awt.event.ActionEvent evt) {   
        //try catch to call the book page                                   
        try {
            new BookPage(title3.getText(), author3.getText(), covers[2]+1, this.customer).setVisible(true);        
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }//end try catch

        //set this page to invisible
        this.dispose();
    }//end of method gtb3ActionPerformed

    /**
     * This method checks if all the files need for this program to work exist.
     */
    private boolean isDataPresent(){
        //String [] to store the diectories this file needs
        String [] dirs = {"data/books.txt", "images"};

        //for loop to traverse through dirs
        for(String dir : dirs){
            //check if the file path doesn't exist
            if(!(new File(dir).exists())){
                //if no match was found just output a dialog box saying so
                JOptionPane.showMessageDialog(null, "1 or more data files were not found!\n Please consult Booksmart documentation!\nYou will be directed to the mainMenu", "Error",
                JOptionPane.ERROR_MESSAGE);
                
                //return false
                return false;
            }//end if
        }//end for loop

        //return true
        return true;
    }//end isDataPresent

    /**
     * This method is called when a java.awt.event.MouseEvent is performed on friendsMenuMouseClicked
     * @param evt The action performed on friendsMenuMouseClicked
     */
    private void friendsMenuMouseClicked(java.awt.event.MouseEvent evt) {
        //try catch to create instance of Friends_Page and set it visible
        try {
            new Friends_Page(this.customer, null).setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }//end of try catch

        //make this page invisible
        this.dispose();
    }//end of method friendsMenuMouseClicked

    /**
     * This method is called when a java.awt.event.MouseEvent is performed on menuMenuMouseClicked
     * @param evt The action performed on menuMenuMouseClicked
     */
    private void menuMenuMouseClicked(java.awt.event.MouseEvent evt) {
        //try catch to create instance of Friends_Page and set it visible
        try {
            new mainMenu(this.customer, false).setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }//end of try catch

        //make this page invisible
        this.dispose();
    }//end of method menuMenuMouseClicked

    /**
     * This method is called when a java.awt.event.MouseEvent is performed on browseMenuMouseClicked
     * @param evt The action performed on browseMenuMouseClicked
     */
    private void browseMenuMouseClicked(java.awt.event.MouseEvent evt) {
        //create instance of Friends_Page and set it visible
        new BrowseMenu(customer).setVisible(true);

        //make this page invisible
        this.dispose();
    }//end of method browseMenuMouseClicked

    /**
     * This method is called when a java.awt.event.MouseEvent is performed on ratedMenuMouseClicked
     * @param evt The action performed on ratedMenuMouseClicked
     */
    private void ratedMenuMouseClicked(java.awt.event.MouseEvent evt) {
        //try catch to create instance of Friends_Page and set it visible
        try {
            new SeeRated(this.customer).setVisible(true);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }//end of try catch

        //make this page invisible
        this.dispose();
    }//end of method ratedMenuMouseClicked

    /**
     * This method is called when a java.awt.event.MouseEvent is performed on addMenuMouseClicked
     * @param evt The action performed on addMenuMouseClicked
     */
    private void addMenuMouseClicked(java.awt.event.MouseEvent evt) {
        //try catch to create instance of Friends_Page and set it visible
        try {
            new addBooks(this.customer).setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }//end of try catch

        //make this page invisible
        this.dispose();
    }//end of method addMenuMouseClicked

    /**
     * This method is called when a java.awt.event.MouseEvent is performed on recMenu
     * @param evt The action performed on recMenu
     */
    private void recMenuMouseClicked(java.awt.event.MouseEvent evt) {
        //create a instance of Recommend and set it visible
        new Recommend(this.customer).setVisible(true);

        //make this page invisible
        this.dispose();
    }//end of method recMenuMouseClicked

    /**
     * This method returns a ArrayList containing the linenumbers of all of the books they have rated
     * @return a ArrayList containing the linenumbers of all of the books they have rated
     */
    public ArrayList<Integer> getRated() {
        //This ArrayList store books that have already been rated
        ArrayList<Integer> alreadyRated = new ArrayList<>();

        //This is the file path the this users rated books
        File myFile = new File("stars/" + this.customer.getUsername() + "-rated.txt");

        //Scanner to readFile
        Scanner inputFile = null;

        //Try-catch to initialize the Scanner
        try {
            inputFile = new Scanner(myFile);
        } catch (Exception e) {
            e.printStackTrace();
        }//end try-catch

        //while loop to traverse through the file
        while(inputFile.hasNextLine()){
            //read the line into an array deliniated by commas
            String [] line = inputFile.nextLine().split(",");

            //add the data of which line the rated book is on, to alreadyRated
            alreadyRated.add(Integer.parseInt(line[2]));
        }//end while loop

        //return alreadyRated
        return alreadyRated;
    }//end getRated

    /**
     * This method is the algorithm that this class will use, to select three random books
     */
    public void algorithm(){
        //The directory of where the images are stored
        final String BOOK_DIR = "images";

        //the path to the books.txt
        final String bookList = "data/books.txt";

        //ArrayList to store books this.customer has rated
        ArrayList <Integer> alreadyRated = getRated();

        //Create a File object representing all of the
        File dir = new File(BOOK_DIR);
        File [] bookCovers = dir.listFiles();

        //array storing covers that have been already selected
        int [] alreadySelected = {-1,-1,-1};

        //for loop to travers through covers
        for(int i = 0; i < covers.length; i++){
            //boolean controlling while loop
            boolean run = true;

            //while loop to make sure 3 unique covers are chosen, and the covers have not been rated before
            while(run){
                //selected a random number between 0 and bookCovers.length-1
                covers[i] = (int) (Math.random()*bookCovers.length);

                //for loop to check is this cover has been selected before or rated before
                for(int j = i-1; j > -1; j--){
                    //if the number chosen has already been selected then, break the for loop and set run to false
                    if(covers[i] == alreadySelected[j] || alreadyRated.contains(covers[i])){
                        run = false;
                        break;
                    }//end if
                }//end of for loop

                //reverse run
                run = !run;
            }//end while loop
            alreadySelected[i] = covers[i];
        }//end for loop

        //Strings to hold the path to the 3 randomly selected images
        String bookCover1Path = "images\\" + (covers[0]+1) + ".jpg";
        String bookCover2Path = "images\\" + (covers[1]+1) + ".jpg";
        String bookCover3Path = "images\\" + (covers[2]+1) + ".jpg";

        //set the book covers to the right icons
        bookCover1.setIcon(new javax.swing.ImageIcon(bookCover1Path));
        bookCover2.setIcon(new javax.swing.ImageIcon(bookCover2Path));
        bookCover3.setIcon(new javax.swing.ImageIcon(bookCover3Path));

        //array to copy the list of books chosen, for sorting
        int [] coversCopy = new int[covers.length];

        //for loop to copy covers into coversCopy
        for(int i = 0; i < coversCopy.length; i++){
            coversCopy[i] = covers[i];
        }//end for loop

        //sort covers copy
        Arrays.sort(coversCopy);

        //HashMap to store the corresponding inicies between covers and coversCopy
        HashMap <Integer, Integer> map = new HashMap<>();

        //for loop to put key and values into map
        for(int i = 0; i < coversCopy.length; i++){
            for(int j = 0; j < covers.length; j++){
                if(coversCopy[i] == covers[j]){
                    map.put(coversCopy[i], j);
                    break;
                }//end if
            }//end for loop traversing through covers
        }//end for loop traversing through coversCopy

        //2D string array to store the infor of the 3 books selected
        //1st row is the titls
        //2nd row is the author names
        String [] [] info = {
                {"PlaceHolder","PlaceHolder","PlaceHolder"},
                {"PlaceHolder","PlaceHolder","PlaceHolder"}
        };

        //File object to store where the book data is stored
        File file = new File(bookList);

        //Scanner to read the book data
        Scanner reader = null;

        //try catch to initialize the Scanner
        try{
            reader = new Scanner(file);
        }catch(Exception e){
            e.printStackTrace();
        }//end of try catch

        //Variable to count the indicies of coversCopy
        int indexCount = 0;

        //Variable to keep track of lines of file
        int count = 0;

        //while loop to read through the file
        while(reader.hasNextLine()){
            //boolean to reprent is the loop should just move to the next line
            boolean cont = false;

            //if statement to check is the current line count is equal to the random line chosen in coversCopy[indexCount]
            if(count == coversCopy[indexCount]){
                //set cont to true
                cont = true;
            }
            //if cont equals false then skip line
            //or else read the line and get the data
            if(!cont){
                reader.nextLine();
            }else{
                //read line in to array deliniated by the commas
                String [] line = reader.nextLine().split(",");

                //store the data in info
                info[0][map.get(coversCopy[indexCount])] = line[0];
                info[1][map.get(coversCopy[indexCount])] = line[1];

                //increment index count
                indexCount++;
            }//end if else statement

            //increment count
            count++;

            //if statment to check if indexCount is equal to 3
            //if so break the while loop
            if(indexCount == 3){
                break;
            }//end if statement
        }//end of while loop

        //set the three JLabels representing the titles of the three random books to the right titles
        title1.setText(info[0][0]);
        title2.setText(info[0][1]);
        title3.setText(info[0][2]);

        //set the three JLabels representing the author names of of the thrww random books
        author1.setText(info[1][0]);
        author2.setText(info[1][1]);
        author3.setText(info[1][2]);
    }//end of method algorithm

    // Variables declaration - do not modify
    private javax.swing.JMenu addMenu;
    private javax.swing.JLabel author1;
    private javax.swing.JLabel author2;
    private javax.swing.JLabel author3;
    private javax.swing.JLabel bookCover1;
    private javax.swing.JLabel bookCover2;
    private javax.swing.JLabel bookCover3;
    private javax.swing.JMenu browseMenu;
    private javax.swing.JMenu friendsMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu logo;
    private javax.swing.JMenu menuMenu;
    private javax.swing.JMenu ratedMenu;
    private javax.swing.JMenu recMenu;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JButton gtb1;
    private javax.swing.JButton gtb2;
    private javax.swing.JButton gtb3;
    // End of variables declaration
}//end of class RandomBook