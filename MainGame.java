import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainGame extends JFrame{
		private JLabel Pokemon, selectFood, selectPokemon, pokemonIcon, pokeballIcon1, pokeballIcon2, pokeballIcon3, pokeballIcon4, pokeballIcon5, backgoundLabel;
		private JButton eatButton, exerciseButton, sleepButton;
		private JTextArea statusArea;
		private JPanel panel;
		private JRadioButton magikarp,rayquaza,growlithe;
		private JComboBox foodBox;
		private Icon start, magikarpIcon, rayquazaIcon, growlitheIcon, pokeballIcon, magikarpLazy, rayquazaLazy, growlitheLazy, arcanine, gyarados, bigPokeball, backgound, backgound2, backgound1, backgound3 ;
		private String berryNames[];
		private Trainer trainer;
		
	    int  magikarpMumber, rayquazaMumber, growlitheMember, arcanineMember, gyaradosMenber;
	    int  countPsyduckEvo;
		
		public MainGame()
		{
			super("PokemonGame");
	        Container c = getContentPane();
	        c.setBounds(100, 100, 850, 550);
	        berryNames = new String[] {
	                "Berry",     
	                "GoldBerry", 
	                "MysteryBerry",   
	        };
	        trainer = new Trainer();
	        trainer.pokemons.add(new Magikarp());
	        trainer.pokemons.add(new Rayquaza());
	        trainer.pokemons.add(new Growlithe());
	        trainer.pokemons.add(new Arcanine());
	        trainer.pokemons.add(new Gyarados());
	        //Set panel;
	        panel = new JPanel();
	        panel.setLayout(null);
	        
	        
	        //Create components and set position
	        Pokemon = new JLabel("Pokemon");
	        Pokemon.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        Pokemon.setBounds(380, 10, 73, 22);
	        selectFood = new JLabel("Select Food");
	        selectFood.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        selectFood.setBounds(680, 40, 65, 29);
	        selectPokemon = new JLabel("Select Pokemons");
	        selectPokemon.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        selectPokemon.setBounds(66, 47, 98, 14);
	        
	        
	        statusArea = new JTextArea("",425,227);
	        statusArea.setBounds(202, 249, 425, 227);
	        
	        eatButton = new JButton("Feed");
	        eatButton.setBounds(668, 108, 89, 23);
	        exerciseButton =  new JButton("Exercise");
	        exerciseButton.setBounds(620, 146, 89, 23);
	        sleepButton = new JButton("Sleep");
	        sleepButton.setBounds(719, 146, 89, 23);
	        
	        foodBox = new JComboBox<Object>(berryNames);
	        foodBox.setBounds(619, 71, 183, 20);
	        
	        magikarp = new JRadioButton("Magikarp");
	        magikarp.setBounds(80, 70, 109, 23);
	        rayquaza = new JRadioButton("Rayquaza");
	        rayquaza.setBounds(80, 96, 109, 23);
	        growlithe= new JRadioButton("Growlithe");
	        growlithe.setBounds(80, 122, 109, 23);
	        
	        ButtonGroup group = new ButtonGroup();
	        group.add(magikarp);
	        group.add(rayquaza);
	        group.add(growlithe);
	        
	        
	        
	        //Create Icon
	        start = new ImageIcon(getClass().getResource("StartGame.png"));
	        magikarpIcon = new ImageIcon(getClass().getResource("Magikarp.gif"));
	        magikarpLazy = new ImageIcon(getClass().getResource("Magikarp_Lazy.gif"));
	        rayquazaIcon = new ImageIcon(getClass().getResource("Rayquaza.gif"));
	        rayquazaLazy = new ImageIcon(getClass().getResource("Rayquaza_Lazy.gif"));
	        growlitheIcon = new ImageIcon(getClass().getResource("Growlithe.gif"));
	        growlitheLazy = new ImageIcon(getClass().getResource("Growlithe_Lazy.gif"));
	        arcanine = new ImageIcon(getClass().getResource("GrowlitheEvo.gif"));
	        gyarados = new ImageIcon(getClass().getResource("MagikarpEvo.jpg"));
	        pokeballIcon = new ImageIcon(getClass().getResource("Pokeball.gif"));
	        bigPokeball = new ImageIcon(getClass().getResource("BigPokeball.gif"));
	        backgound = new ImageIcon(getClass().getResource("Backgound.png"));
	        backgound1 = new ImageIcon(getClass().getResource("Backgound2.jpg"));
	        backgound2 = new ImageIcon(getClass().getResource("Backgound1.jpg"));
	        backgound3 = new ImageIcon(getClass().getResource("Backgound3.png"));
	        pokemonIcon = new JLabel("");
	        pokeballIcon1 = new JLabel("");
	        pokeballIcon2 = new JLabel("");
	        pokeballIcon3 = new JLabel("");
	        pokeballIcon4 = new JLabel("");
	        pokeballIcon5 = new JLabel("");
	        backgoundLabel = new JLabel("");
	        pokemonIcon.setIcon(start);
	        pokemonIcon.setBounds(274, 43, 280, 188);
	        pokeballIcon1.setIcon(pokeballIcon);
	        pokeballIcon1.setBounds(53, 69, 26, 22);
	        pokeballIcon2.setIcon(pokeballIcon);
	        pokeballIcon2.setBounds(53, 95, 26, 22);
	        pokeballIcon3.setIcon(pokeballIcon);
	        pokeballIcon3.setBounds(53, 121, 26, 22);
	        pokeballIcon4.setIcon(bigPokeball);
	        pokeballIcon4.setBounds(20, 297, 144, 131);
	        pokeballIcon5.setIcon(bigPokeball);
	        pokeballIcon5.setBounds(658, 297, 144, 131);
	        backgoundLabel.setIcon(backgound);
	        backgoundLabel.setBounds(0, 0, 834, 511);
	        
	        //Eatbutton action listener
	        eatButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if(magikarp.isSelected() && (trainer.getEnergy(magikarpMumber) > 5) && (trainer.getFeeling(magikarpMumber) > 30)){
	                	if((trainer.getFeeling(magikarpMumber) >= 500)) {
	                    	magikarpMumber = gyaradosMenber;
	                    	pokemonIcon.setIcon(gyarados);
	                    }
	                	else {
	                		pokemonIcon.setIcon(magikarpIcon);
	                	}
	                	trainer.pokemons.get(magikarpMumber);
	                    switch (foodBox.getSelectedIndex()) {
	                    	case 0 :
	                    		
	                    		trainer.eatBerry(magikarpMumber);
	                    		trainer.badFeeling(magikarpMumber);
	                    		break;
	                    	case 1 :
		                    	trainer.eatGoldBerry(magikarpMumber);
		                    	trainer.badFeeling(magikarpMumber);
		                    	break;
	                    	case 2 :
		                    	trainer.eatMysteryBerry(magikarpMumber);
		                    	trainer.badFeeling(magikarpMumber);
		                    	break;
	                    }
	                    statusArea.setText(trainer.showStatus(trainer.pokemons,magikarpMumber));
	                }
	                
	                else if(rayquaza.isSelected() && (trainer.getEnergy(rayquazaMumber) > 5)){
	                	trainer.pokemons.get(rayquazaMumber);
	                	pokemonIcon.setIcon(rayquazaIcon);
	                	switch (foodBox.getSelectedIndex()) {
                    		case 0 :
                    			trainer.eatBerry(rayquazaMumber);
                    			trainer.goodFeeling(rayquazaMumber);
                    			break;
                    		case 1 :
	                    		trainer.eatGoldBerry(rayquazaMumber);
	                    		trainer.goodFeeling(rayquazaMumber);
	                    		break;
                    		case 2 :
                    			trainer.eatMysteryBerry(rayquazaMumber);
                    			trainer.goodFeeling(rayquazaMumber);
                    			break;
	                	}
	                	statusArea.setText(trainer.showStatus(trainer.pokemons,rayquazaMumber));
	                }
	                
	                else if(growlithe.isSelected() && (trainer.getEnergy(growlitheMember) > 5) && (trainer.getFeeling(growlitheMember) > 30)){
	                	if((trainer.getFeeling(growlitheMember) >= 500)) {
	                		growlitheMember = arcanineMember;
	                    	pokemonIcon.setIcon(arcanine);
	                    }
	                	else {
	                		pokemonIcon.setIcon(growlitheIcon);
	                	}
	                	trainer.pokemons.get(growlitheMember);
	                	switch (foodBox.getSelectedIndex()) {
                			case 0 :
                				trainer.eatBerry(growlitheMember);
                				trainer.badFeeling(growlitheMember);
                				break;
                			case 1 :
                				trainer.eatGoldBerry(growlitheMember);
                				trainer.badFeeling(growlitheMember);
                				break;
                			case 2 :
                				trainer.eatMysteryBerry(growlitheMember);
                				trainer.badFeeling(growlitheMember);
                				break;
	                	}
	                	statusArea.setText(trainer.showStatus(trainer.pokemons,growlitheMember));
	                }
	                
	                else if( (trainer.getEnergy(magikarpMumber) <= 5) || (trainer.getFeeling(magikarpMumber) <= 30))
	    	        	pokemonIcon.setIcon(magikarpLazy);
	                
	                else if( (trainer.getEnergy(rayquazaMumber) <= 5) || (trainer.getFeeling(rayquazaMumber) <= 30))
	    	        	pokemonIcon.setIcon(rayquazaLazy);
	                
	                else if( (trainer.getEnergy(growlitheMember) <= 5) || (trainer.getFeeling(growlitheMember) <= 30))
	    	        	pokemonIcon.setIcon(growlitheLazy);
	            }
	        });
	        
	        //Exercise action listener
	        exerciseButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if(magikarp.isSelected() && (trainer.getEnergy(magikarpMumber) > 5) && (trainer.getFeeling(magikarpMumber) > 30)){
	                	if((trainer.getFeeling(magikarpMumber) >= 500)) {
	                    	magikarpMumber = gyaradosMenber;
	                    	pokemonIcon.setIcon(gyarados);
	                    }
	                	else {
	                		pokemonIcon.setIcon(magikarpIcon);
	                	}
	                	trainer.pokemons.get(magikarpMumber);
	                    trainer.exercise(magikarpMumber);
	                    trainer.badFeeling(magikarpMumber);
	                    statusArea.setText(trainer.showStatus(trainer.pokemons,magikarpMumber));
	                }
	                
	                else if(rayquaza.isSelected() && (trainer.getEnergy(rayquazaMumber) > 5) && (trainer.getFeeling(rayquazaMumber) > 30)){
	                	trainer.pokemons.get(rayquazaMumber);
	                	pokemonIcon.setIcon(rayquazaIcon);
	                	trainer.exercise(rayquazaMumber);
	                	trainer.badFeeling(rayquazaMumber);
	                	statusArea.setText(trainer.showStatus(trainer.pokemons,rayquazaMumber));	
	                }
	                
	                else if(growlithe.isSelected()  && (trainer.getEnergy(growlitheMember) > 5)){
	                	if((trainer.getFeeling(growlitheMember) >= 500)) {
	                		growlitheMember = arcanineMember;
	                    	pokemonIcon.setIcon(arcanine);
	                    }
	                	else {
	                		pokemonIcon.setIcon(growlitheIcon);
	                	}
	                	trainer.pokemons.get(growlitheMember);
	                	trainer.exercise(growlitheMember);
	                	trainer.goodFeeling(growlitheMember);
	                	statusArea.setText(trainer.showStatus(trainer.pokemons,growlitheMember));
	                }
	                
	                else if( (trainer.getEnergy(magikarpMumber) <= 5) || (trainer.getFeeling(magikarpMumber) <= 30))
	    	        	pokemonIcon.setIcon(magikarpLazy);
	                
	                else if( (trainer.getEnergy(rayquazaMumber) <= 5) || (trainer.getFeeling(rayquazaMumber) <= 30))
	    	        	pokemonIcon.setIcon(rayquazaLazy);
	                
	                else if( (trainer.getEnergy(growlitheMember) <= 5) || (trainer.getFeeling(growlitheMember) <= 30))
	    	        	pokemonIcon.setIcon(growlitheLazy);
	            }
	        });
	        
		      //Sleep action listener
	        sleepButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if(magikarp.isSelected()){
	                	if((trainer.getFeeling(magikarpMumber) >= 500)) {
	                    	magikarpMumber = gyaradosMenber;
	                    	pokemonIcon.setIcon(gyarados);
	                    }
	                	else {
	                		pokemonIcon.setIcon(magikarpIcon);
	                	}
	                	trainer.pokemons.get(magikarpMumber);
	                    trainer.sleep(magikarpMumber);
	                    trainer.goodFeeling(magikarpMumber);
	                    statusArea.setText(trainer.showStatus(trainer.pokemons,magikarpMumber));
	                }
	                
	                else if(rayquaza.isSelected()){
	                	trainer.pokemons.get(rayquazaMumber);
	                	pokemonIcon.setIcon(rayquazaIcon);
	                	trainer.sleep(rayquazaMumber);
	                	trainer.goodFeeling(rayquazaMumber);
	                	statusArea.setText(trainer.showStatus(trainer.pokemons,rayquazaMumber));	
	                }
	                
	                else if(growlithe.isSelected() && (trainer.getFeeling(growlitheMember) > 30)){
	                	if((trainer.getFeeling(growlitheMember) >= 500)) {
	                		growlitheMember = arcanineMember;
	                    	pokemonIcon.setIcon(arcanine);
	                    }
	                	else {
	                		pokemonIcon.setIcon(growlitheIcon);
	                	}
	                	trainer.pokemons.get(growlitheMember);
	                	trainer.sleep(growlitheMember);
	                	trainer.badFeeling(growlitheMember);
	                	statusArea.setText(trainer.showStatus(trainer.pokemons,growlitheMember));
	                }
	                else if( (trainer.getEnergy(magikarpMumber) <= 5) || (trainer.getFeeling(magikarpMumber) <= 30))
	    	        	pokemonIcon.setIcon(magikarpLazy);
	                
	                else if( (trainer.getEnergy(rayquazaMumber) <= 5) || (trainer.getFeeling(rayquazaMumber) <= 30))
	    	        	pokemonIcon.setIcon(rayquazaLazy);
	                
	                else if( (trainer.getEnergy(growlitheMember) <= 5) || (trainer.getFeeling(growlitheMember) <= 30))
	    	        	pokemonIcon.setIcon(growlitheLazy);
	            }
	        });
	        
	        //JRidoButton action listener
	        magikarp.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		if((trainer.getFeeling(magikarpMumber) >= 500)) {
                    	magikarpMumber = gyaradosMenber;
                    	pokemonIcon.setIcon(gyarados);
                    }
                	else {
                		pokemonIcon.setIcon(magikarpIcon);
                	}
	    	        magikarpMumber = 0;
	    	        backgoundLabel.setIcon(backgound2);
	    	        statusArea.setText(trainer.showStatus(trainer.pokemons,magikarpMumber));
	    	        if( (trainer.getEnergy(magikarpMumber) <= 5) || (trainer.getFeeling(magikarpMumber) <= 30))
	    	        	pokemonIcon.setIcon(magikarpLazy);
	        	}
	        });
	        
	        rayquaza.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		backgoundLabel.setIcon(backgound1);
	        		pokemonIcon.setIcon(rayquazaIcon);
	    	        rayquazaMumber = 1;
	    	        statusArea.setText(trainer.showStatus(trainer.pokemons,rayquazaMumber));
	    	        if( (trainer.getEnergy(rayquazaMumber) <= 5) || (trainer.getFeeling(rayquazaMumber) <= 30))
	    	        	pokemonIcon.setIcon(rayquazaLazy);
	        	}
	        });
	        
	        growlithe.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		if((trainer.getFeeling(growlitheMember) >= 500)) {
                		growlitheMember = arcanineMember;
                    	pokemonIcon.setIcon(arcanine);
                    }
                	else {
                		pokemonIcon.setIcon(growlitheIcon);
                	}
	        		backgoundLabel.setIcon(backgound3);
	    	        growlitheMember = 2;
	    	        statusArea.setText(trainer.showStatus(trainer.pokemons,growlitheMember));
	    	        if( (trainer.getEnergy(growlitheMember) <= 5) || (trainer.getFeeling(growlitheMember) <= 30))
	    	        	pokemonIcon.setIcon(growlitheLazy);
	        	}
	        });
	        arcanineMember = 3;
	        gyaradosMenber = 4;
	
	        
	        //Set layout
	        
	        panel.add(Pokemon);
	        panel.add(selectFood);
	        panel.add(selectPokemon);
	        panel.add(pokemonIcon);
	        panel.add(statusArea);
	        panel.add(foodBox);
	        panel.add(eatButton);
	        panel.add(magikarp);
	        panel.add(rayquaza);
	        panel.add(growlithe);
	        panel.add(pokeballIcon1);
	        panel.add(pokeballIcon2);
	        panel.add(pokeballIcon3);
	        panel.add(pokeballIcon4);
	        panel.add(pokeballIcon5);
	        panel.add(exerciseButton);
	        panel.add(sleepButton);
	        panel.add(backgoundLabel);
	        c.add(panel);
	        
	        //Set others
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(850, 550);
	        setVisible(true);
	        
		}
		
}