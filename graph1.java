import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import java.util.*;
import java.io.FileWriter; 
import java.io.IOException;

public class graph1 {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldX;
	private JTextField textFieldY;
	private JLabel lblAddVertex;
	private JLabel lblName;
	private JLabel lblXcordinate;
	private JLabel lblYcordinate;
	private JButton btnAdd;
	private JLabel lblSearchForA;
	private JTextField textFieldSearch;
	private JButton btnSearch;
	private JButton btnNewButton;
	private JLabel lblDeleteAVertex;
	private JLabel lblVertex;
	private JLabel lblVertexToBe;
	private JTextField textFielddelete;
	private JButton btnDelete;
	private JTextField textFieldmodify;
	private JLabel lblVertexToBe_1;
	private JTextField textFieldnx;
	private JLabel lblNewXcordinate;
	private JLabel lblNewYcoordinate;
	private JTextField textFieldny;
	private JLabel lblAddEdge;
	private JLabel lblFromVertex;
	private JLabel lblToVertex;
	private JLabel lblWeight;
	private JTextField textFieldedge1;
	private JTextField textFieldedge2;
	private JTextField textFieldweight;
	private JButton btnAdd_1;
	private JLabel lblSearchEdge;
	private JLabel lblFromVertex_1;
	private JLabel lblToVertex_1;
	private JTextField textFieldfr;
	private JTextField textFieldto;
	private JButton btnSearch_1;
	private JLabel lblDeleteEdge;
	private JLabel lblFromVertex_2;
	private JLabel lblToVertex_2;
	private JTextField textFieldfv;
	private JTextField textFieldtv;
	private JButton btnDelete_1;
	private JLabel lblModifyEdge;
	private JLabel lblFromVertex_3;
	private JLabel lblToVertex_3;
	private JTextField textFieldfromv;
	private JTextField textFieldtov;
	private JButton btnNewButton_1;
	private JLabel lblNewWeight;
	private JTextField textFieldnw;
	private JLabel lblInput;
	private JTextField textFieldpath;
	private JButton btnLoad;
	private JLabel lblExport;
	private JLabel lblOldFilePath;
	private JTextField textFieldnew;
	private JButton btnExport;
	private JLabel lblInputFileName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//scanner sc = new scanner(System.in);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					graph1 window = new graph1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public graph1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1298, 878);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(461, 35, 106, 28);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldX = new JTextField();
		textFieldX.setBounds(648, 35, 106, 28);
		frame.getContentPane().add(textFieldX);
		textFieldX.setColumns(10);
		
		textFieldY = new JTextField();
		textFieldY.setBounds(830, 35, 106, 28);
		frame.getContentPane().add(textFieldY);
		textFieldY.setColumns(10);
		
		lblAddVertex = new JLabel("Add Vertex");
		lblAddVertex.setFont(new Font("Chilanka", Font.BOLD, 20));
		lblAddVertex.setForeground(new Color(0, 0, 0));
		lblAddVertex.setBounds(12, 25, 129, 38);
		frame.getContentPane().add(lblAddVertex);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblName.setBounds(473, 12, 66, 28);
		frame.getContentPane().add(lblName);
		
		lblXcordinate = new JLabel("X-Coordinate");
		lblXcordinate.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblXcordinate.setBounds(649, 12, 129, 28);
		frame.getContentPane().add(lblXcordinate);
		
		lblYcordinate = new JLabel("Y-Coordinate");
		lblYcordinate.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblYcordinate.setBounds(831, 12, 142, 28);
		frame.getContentPane().add(lblYcordinate);
		
		class vertex
		{
		  String name;
		  int XCordinate;
		  int YCordinate;
		 
		   public vertex(String name,int XCordinate,int YCordinate )
		   {
		      this.name =name;
		      this.XCordinate=XCordinate;
		      this.YCordinate=YCordinate;
		    //  a = new ArrayList<vertex> ();
		   }

		}
		
		class edge
		{
		  String FromVertex;
		  String ToVertex;
		  int Weight;
		  public edge(String FromVertex,String ToVertex,int Weight)
		  {
		      this.FromVertex=FromVertex;
		      this.ToVertex=ToVertex;
		      this.Weight=Weight;
		  }
		}

		 ArrayList<vertex> a = new ArrayList<vertex> ();
		 ArrayList<edge> e = new ArrayList<edge> ();
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try{
						String name;
						int x,y;
						x = Integer.parseInt(textFieldX.getText());
						y = Integer.parseInt(textFieldY.getText());
						
						name = textFieldName.getText();
						vertex vert = new vertex(name,x,y);
						a.add(vert);
						JOptionPane.showMessageDialog(null,"Vertex Added");
					}catch(NumberFormatException e) 
					{
						JOptionPane.showMessageDialog(null,"Enter valid Coordinates");}
					
			}
		});
		btnAdd.setFont(new Font("Dialog", Font.BOLD, 16));
		btnAdd.setBounds(1019, 28, 114, 38);
		frame.getContentPane().add(btnAdd);
		
		lblSearchForA = new JLabel("Search for a Vertex and Get Details");
		lblSearchForA.setFont(new Font("Chilanka", Font.BOLD, 20));
		lblSearchForA.setBounds(14, 92, 354, 38);
		frame.getContentPane().add(lblSearchForA);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(461, 102, 105, 28);
		frame.getContentPane().add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String name1;
					name1 = textFieldSearch.getText();
					int count = 0;
					for(int i = 0;i < a.size();i++)
					{
						if(name1.equals(a.get(i).name))
						{
							count = count + 1;
						}
					}
					if(count == 1)
					{
						JOptionPane.showMessageDialog(null,"Yes, The input vertex is in the Graph");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Vertex is not in the Graph");
					}
			}
		});
		btnSearch.setFont(new Font("Dialog", Font.BOLD, 16));
		btnSearch.setBounds(1019, 90, 117, 38);
		frame.getContentPane().add(btnSearch);
		
		btnNewButton = new JButton("Get Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Vertex"+" "+"X-Cordinate"+" "+"Y-Cordinate");
				for(int i = 0; i < a.size(); i++)
				{
					System.out.println(a.get(i).name+" "+a.get(i).XCordinate+" "+a.get(i).YCordinate);
				}
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.setBounds(1141, 90, 145, 38);
		frame.getContentPane().add(btnNewButton);
		
		lblDeleteAVertex = new JLabel("Delete a vertex");
		lblDeleteAVertex.setFont(new Font("Chilanka", Font.BOLD, 20));
		lblDeleteAVertex.setBounds(12, 155, 159, 38);
		frame.getContentPane().add(lblDeleteAVertex);
		
		lblVertex = new JLabel("Vertex");
		lblVertex.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblVertex.setBounds(471, 75, 79, 28);
		frame.getContentPane().add(lblVertex);
		
		lblVertexToBe = new JLabel("Vertex to be deleted");
		lblVertexToBe.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblVertexToBe.setBounds(461, 142, 161, 28);
		frame.getContentPane().add(lblVertexToBe);
		
		textFielddelete = new JTextField();
		textFielddelete.setBounds(461, 170, 106, 28);
		frame.getContentPane().add(textFielddelete);
		textFielddelete.setColumns(10);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name;
				name = textFielddelete.getText();
				int count = 0;
				for(int i = 0; i < a.size(); i++)
				{
					if(name.equals(a.get(i).name))
					{
						a.remove(i);
						count = 1;
					}
				}
				
				if(count == 1)
				{
					JOptionPane.showMessageDialog(null,name +" is deleted");
					try
					{
						for(int i = 0; i < e.size(); i++)
						{
							if(name.equals(e.get(i).FromVertex) || name.equals(e.get(i).ToVertex))
							{
								e.remove(i);
							}
						}
						
					}catch(Exception e) {JOptionPane.showMessageDialog(null,"No Edge is present");}
					
				}
					
				else
				{
					JOptionPane.showMessageDialog(null,"Vertex not found");
				}
					
				
//				for(int i = 0; i < a.size(); i++)
//				{
//					System.out.println(a.get(i).name+" "+a.get(i).XCordinate+" "+a.get(i).YCordinate);
//				}
			}
		});
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 16));
		btnDelete.setBounds(1019, 153, 114, 38);
		frame.getContentPane().add(btnDelete);
		
		JLabel lblModifyTheDetails = new JLabel("Modify the Details of the Given Vertex");
		lblModifyTheDetails.setFont(new Font("Chilanka", Font.BOLD, 20));
		lblModifyTheDetails.setBounds(12, 229, 356, 28);
		frame.getContentPane().add(lblModifyTheDetails);
		
		textFieldmodify = new JTextField();
		textFieldmodify.setBounds(461, 241, 104, 28);
		frame.getContentPane().add(textFieldmodify);
		textFieldmodify.setColumns(10);
		
		JButton btnModify = new JButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
					String name;
					int x,y;
					name = textFieldmodify.getText();
					x = Integer.parseInt(textFieldnx.getText());
					y = Integer.parseInt(textFieldny.getText());
				
					for(int i = 0; i < a.size(); i++)
					{
						if(name.equals(a.get(i).name))
						{
							a.get(i).XCordinate = x;
							a.get(i).YCordinate = y;
						}
					}
					JOptionPane.showMessageDialog(null,name +" is modified");
//					for(int i = 0; i < a.size(); i++)
//					{
//						System.out.println(a.get(i).name+" "+a.get(i).XCordinate+" "+a.get(i).YCordinate);
//					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null,"Please provide valid Cordinate to modify");
				}
				
				
			}
		});
		btnModify.setFont(new Font("Dialog", Font.BOLD, 16));
		btnModify.setBounds(1019, 234, 114, 38);
		frame.getContentPane().add(btnModify);
		
		lblVertexToBe_1 = new JLabel("Vertex to be modified");
		lblVertexToBe_1.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblVertexToBe_1.setBounds(462, 224, 179, 18);
		frame.getContentPane().add(lblVertexToBe_1);
		
		textFieldnx = new JTextField();
		textFieldnx.setBounds(648, 241, 106, 28);
		frame.getContentPane().add(textFieldnx);
		textFieldnx.setColumns(10);
		
		lblNewXcordinate = new JLabel("New X-Coordinate");
		lblNewXcordinate.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblNewXcordinate.setBounds(648, 219, 165, 28);
		frame.getContentPane().add(lblNewXcordinate);
		
		lblNewYcoordinate = new JLabel("New Y-Coordinate");
		lblNewYcoordinate.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblNewYcoordinate.setBounds(828, 219, 145, 28);
		frame.getContentPane().add(lblNewYcoordinate);
		
		textFieldny = new JTextField();
		textFieldny.setBounds(830, 241, 114, 28);
		frame.getContentPane().add(textFieldny);
		textFieldny.setColumns(10);
		
		lblAddEdge = new JLabel("Add Edge");
		lblAddEdge.setFont(new Font("Chilanka", Font.BOLD, 20));
		lblAddEdge.setBounds(12, 306, 142, 28);
		frame.getContentPane().add(lblAddEdge);
		
		lblFromVertex = new JLabel("From Vertex");
		lblFromVertex.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblFromVertex.setBounds(461, 281, 117, 24);
		frame.getContentPane().add(lblFromVertex);
		
		lblToVertex = new JLabel("To Vertex");
		lblToVertex.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblToVertex.setBounds(650, 281, 104, 24);
		frame.getContentPane().add(lblToVertex);
		
		lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblWeight.setBounds(840, 281, 66, 18);
		frame.getContentPane().add(lblWeight);
		
		textFieldedge1 = new JTextField();
		textFieldedge1.setBounds(461, 306, 106, 28);
		frame.getContentPane().add(textFieldedge1);
		textFieldedge1.setColumns(10);
		
		textFieldedge2 = new JTextField();
		textFieldedge2.setBounds(648, 306, 106, 28);
		frame.getContentPane().add(textFieldedge2);
		textFieldedge2.setColumns(10);
		
		textFieldweight = new JTextField();
		textFieldweight.setBounds(830, 306, 114, 28);
		frame.getContentPane().add(textFieldweight);
		textFieldweight.setColumns(10);
		
		btnAdd_1 = new JButton("Add");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String name1 = textFieldedge1.getText();
					String name2 = textFieldedge2.getText();
					int weight;
					weight = Integer.parseInt(textFieldweight.getText());
					int f1=0;
					int f2=0;
					for(int i = 0; i < a.size(); i++)
					{
						if(name1.equals(a.get(i).name))
						{
							f1 = 1;
						}
						if(name2.equals(a.get(i).name))
						{
							f2 = 1;
						}
					}
					if(f1 == 1 && f2 == 1)
					{
						edge ed = new edge(name1,name2,weight);
						if(name1 != name2)
							e.add(ed);
						JOptionPane.showMessageDialog(null,"Edge Added");
					}
					else
						JOptionPane.showMessageDialog(null,"Enter valid Vertices");
					
//					for(int i = 0; i < e.size(); i++)
//					{
//						System.out.println(e.get(i).FromVertex+"  "+e.get(i).ToVertex+"  "+e.get(i).Weight);
//					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null,"Please Enter valid weight of the Edge");
				}
				
			}
		});
		btnAdd_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnAdd_1.setBounds(1019, 299, 114, 38);
		frame.getContentPane().add(btnAdd_1);
		
		lblSearchEdge = new JLabel("Search Edge");
		lblSearchEdge.setFont(new Font("Chilanka", Font.BOLD, 20));
		lblSearchEdge.setBounds(14, 376, 135, 28);
		frame.getContentPane().add(lblSearchEdge);
		
		lblFromVertex_1 = new JLabel("From Vertex");
		lblFromVertex_1.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblFromVertex_1.setBounds(461, 350, 106, 28);
		frame.getContentPane().add(lblFromVertex_1);
		
		lblToVertex_1 = new JLabel("To Vertex");
		lblToVertex_1.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblToVertex_1.setBounds(648, 353, 106, 25);
		frame.getContentPane().add(lblToVertex_1);
		
		textFieldfr = new JTextField();
		textFieldfr.setBounds(461, 376, 106, 28);
		frame.getContentPane().add(textFieldfr);
		textFieldfr.setColumns(10);
		
		textFieldto = new JTextField();
		textFieldto.setBounds(648, 376, 106, 28);
		frame.getContentPane().add(textFieldto);
		textFieldto.setColumns(10);
		
		btnSearch_1 = new JButton("Search");
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name1 = textFieldfr.getText();
				String name2 = textFieldto.getText();
				int f1=0;
				int f2=0;
				for(int i= 0; i < e.size(); i++)
				{
					if(name1.equals(e.get(i).FromVertex))
					{
						f1 = 1;
					}
					if(name2.equals(e.get(i).ToVertex))
					{
						f2 = 1;
					}
				}
				if(f1 == 1 && f2 == 1)
				{
					JOptionPane.showMessageDialog(null,"Edge is present");
				}
				else
					JOptionPane.showMessageDialog(null,"Edge is not present");
			}
		});
		btnSearch_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnSearch_1.setBounds(1019, 369, 114, 38);
		frame.getContentPane().add(btnSearch_1);
		
		lblDeleteEdge = new JLabel("Delete Edge");
		lblDeleteEdge.setFont(new Font("Chilanka", Font.BOLD, 20));
		lblDeleteEdge.setBounds(12, 444, 129, 38);
		frame.getContentPane().add(lblDeleteEdge);
		
		lblFromVertex_2 = new JLabel("From Vertex");
		lblFromVertex_2.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblFromVertex_2.setBounds(461, 420, 106, 24);
		frame.getContentPane().add(lblFromVertex_2);
		
		lblToVertex_2 = new JLabel("To Vertex");
		lblToVertex_2.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblToVertex_2.setBounds(648, 423, 106, 18);
		frame.getContentPane().add(lblToVertex_2);
		
		textFieldfv = new JTextField();
		textFieldfv.setBounds(461, 444, 106, 29);
		frame.getContentPane().add(textFieldfv);
		textFieldfv.setColumns(10);
		
		textFieldtv = new JTextField();
		textFieldtv.setBounds(647, 444, 107, 29);
		frame.getContentPane().add(textFieldtv);
		textFieldtv.setColumns(10);
		
		btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name1 = textFieldfv.getText();
				String name2 = textFieldtv.getText();
				int f=0;
				for(int i = 0; i < e.size(); i++)
				{
					if((name1.equals(e.get(i).FromVertex))&&(name2.equals(e.get(i).ToVertex)))
					{
						e.remove(i);
						f = 1;
					}
				}
				if(f == 0)
					JOptionPane.showMessageDialog(null,"Edge not found");
				else
					JOptionPane.showMessageDialog(null,"Edge is Deleted");
//				for(int i = 0; i < e.size(); i++)
//				{
//					System.out.println(e.get(i).FromVertex+" "+e.get(i).ToVertex+" "+e.get(i).Weight);
//				}
			}
		});
		btnDelete_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnDelete_1.setBounds(1019, 442, 114, 38);
		frame.getContentPane().add(btnDelete_1);
		
		lblModifyEdge = new JLabel("Modify Edge");
		lblModifyEdge.setFont(new Font("Chilanka", Font.BOLD, 20));
		lblModifyEdge.setBounds(12, 511, 129, 28);
		frame.getContentPane().add(lblModifyEdge);
		
		lblFromVertex_3 = new JLabel("From Vertex");
		lblFromVertex_3.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblFromVertex_3.setBounds(461, 494, 96, 22);
		frame.getContentPane().add(lblFromVertex_3);
		
		lblToVertex_3 = new JLabel("To Vertex");
		lblToVertex_3.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblToVertex_3.setBounds(648, 496, 99, 18);
		frame.getContentPane().add(lblToVertex_3);
		
		textFieldfromv = new JTextField();
		textFieldfromv.setBounds(461, 511, 106, 28);
		frame.getContentPane().add(textFieldfromv);
		textFieldfromv.setColumns(10);
		
		textFieldtov = new JTextField();
		textFieldtov.setBounds(648, 511, 106, 28);
		frame.getContentPane().add(textFieldtov);
		textFieldtov.setColumns(10);
		
		btnNewButton_1 = new JButton("Modify");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String name1 = textFieldfromv.getText();
					String name2 = textFieldtov.getText();
					int w = Integer.parseInt(textFieldnw.getText());
					int f=0;
					for(int i = 0; i < e.size(); i++)
					{
						if((name1.equals(e.get(i).FromVertex))&&(name2.equals(e.get(i).ToVertex)))
						{
							e.get(i).Weight = w;
							f = 1;
						}
					}
					if(f == 0)
						JOptionPane.showMessageDialog(null,"Edge not found");
					
					else
						JOptionPane.showMessageDialog(null,"Edge is Modified");
					
//					for(int i = 0; i < e.size(); i++)
//					{
//						System.out.println(e.get(i).FromVertex+"  "+e.get(i).ToVertex+"  "+e.get(i).Weight);
//					}
				}catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null,"Please Enter a valid Weight to be Modified");
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_1.setBounds(1019, 504, 114, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewWeight = new JLabel("New Weight");
		lblNewWeight.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblNewWeight.setBounds(830, 494, 96, 22);
		frame.getContentPane().add(lblNewWeight);
		
		textFieldnw = new JTextField();
		textFieldnw.setBounds(830, 511, 117, 28);
		frame.getContentPane().add(textFieldnw);
		textFieldnw.setColumns(10);
		
		lblInput = new JLabel("Load Data from a File");
		lblInput.setFont(new Font("Chilanka", Font.BOLD, 20));
		lblInput.setBounds(12, 588, 230, 28);
		frame.getContentPane().add(lblInput);
		
		textFieldpath = new JTextField();
		textFieldpath.setBounds(577, 583, 265, 38);
		frame.getContentPane().add(textFieldpath);
		textFieldpath.setColumns(10);
		
		btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		       
		        FileReader fr=null; 
		        try
		        { 
		            fr = new FileReader("/home/shubham/Documents/input1.txt"); 
		        } 
		        catch (FileNotFoundException fe) 
		        { 
		            System.out.println("File not found"); 
		        }	        
		        
				String st = textFieldpath.getText();
				Scanner sc = null;
				try {
					sc = new Scanner(new File("/home/shubham/Documents/"+st));
					int n = sc.nextInt();
					for(int i = 0; i < n; i++)
					{
						vertex vert = new vertex(sc.next(),sc.nextInt(),sc.nextInt());
						a.add(vert);
					}
					int edges = sc.nextInt();
					for(int i = 0; i < edges; i++)
					{
						edge ed = new edge(sc.next(),sc.next(),sc.nextInt());
						e.add(ed);
					}
				}
				catch(RuntimeException e1) {
					JOptionPane.showMessageDialog(null,"Input Error");
				}
				catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null,"File Not Found");
				}
			}
		});
		btnLoad.setFont(new Font("Dialog", Font.BOLD, 16));
		btnLoad.setBounds(1019, 581, 114, 38);
		frame.getContentPane().add(btnLoad);
		
		lblExport = new JLabel(" Export Graph");
		lblExport.setFont(new Font("Chilanka", Font.BOLD, 20));
		lblExport.setBounds(12, 642, 152, 44);
		frame.getContentPane().add(lblExport);
		
		lblOldFilePath = new JLabel("New File Name");
		lblOldFilePath.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblOldFilePath.setBounds(444, 656, 114, 18);
		frame.getContentPane().add(lblOldFilePath);
		
		textFieldnew = new JTextField();
		textFieldnew.setBounds(577, 643, 265, 38);
		frame.getContentPane().add(textFieldnew);
		textFieldnew.setColumns(10);
		
		btnExport = new JButton("Export");
		
		class sortvertex implements Comparator<vertex>{

			public int compare(vertex v1, vertex v2) {
				
				return v1.name.compareTo(v2.name);
			}
			
		}
		class sortedge implements Comparator<edge>{

			public int compare(edge e1, edge e2) {
				if(e1.FromVertex != e2.FromVertex)
				{
					return e1.FromVertex.compareTo(e2.FromVertex);
				}
				else
				{
					return e1.ToVertex.compareTo(e2.ToVertex);
				}
			}
			
		}
		
		
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
 
				Collections.sort(a,new sortvertex());
				
				Collections.sort(e,new sortedge());
		        try
		        {
		        	FileWriter fw=new FileWriter("/home/shubham/Documents/newfile.txt"); 
			        
			        fw.write(a.size()+"\n");
			        for (int i = 0; i < a.size(); i++) 
			            fw.write(a.get(i).name+"  "+a.get(i).XCordinate+"  "+a.get(i).YCordinate+"\n");
			        fw.write(e.size()+"\n");
			        for(int i = 0; i < e.size(); i++)
			        	fw.write(e.get(i).FromVertex+"  "+e.get(i).ToVertex+"  "+e.get(i).Weight+"\n");
			        
			        fw.close();
			         
		        }
				catch(IOException e) 
		        {
					JOptionPane.showMessageDialog(null,"Can't Write into File");
				}
		        int ch; 
		        FileReader fr=null; 
		        try
		        { 
		            fr = new FileReader("/home/shubham/Documents/newfile.txt"); 
		        } 
		        catch (FileNotFoundException fe) 
		        { 
		        	JOptionPane.showMessageDialog(null,"File Not Found"); 
		        }
		        try {
		        	while ((ch=fr.read())!=-1) 
			            System.out.print((char)ch); 
			        fr.close();
		        }catch(IOException e1)
		        {
		        	JOptionPane.showMessageDialog(null,"Can't Read text from the File");
		        }
			}
		});
		btnExport.setFont(new Font("Dialog", Font.BOLD, 16));
		btnExport.setBounds(1019, 643, 114, 38);
		frame.getContentPane().add(btnExport);
		
		lblInputFileName = new JLabel("Input File Name");
		lblInputFileName.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblInputFileName.setBounds(444, 594, 123, 22);
		frame.getContentPane().add(lblInputFileName);
	}
}
