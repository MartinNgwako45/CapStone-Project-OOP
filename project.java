import java.util.Scanner;

public class project {
	

	public static ProjectForm getBFInfor(){

		// getperInfor method of projectForm through the keyboard.  		
		@SuppressWarnings("resource")
		Scanner prjnumber = new Scanner(System.in);
		System.out.println("What is the name of the project: ");
		short projectnumber = prjnumber.nextShort();

		@SuppressWarnings("resource")
		Scanner prjname = new Scanner(System.in);
		System.out.println("what is the number of the project: ");
		String projectname = prjname.nextLine();
		//		    
		@SuppressWarnings("resource")
		Scanner builtype = new Scanner(System.in);
		System.out.println("please enter the type of buliding structure you wish to build:\n"
				+ "House\n"
				+ "Apartment\n"
				+ "Store");
		String buildingtype = builtype.nextLine();

		@SuppressWarnings("resource")
		Scanner address = new Scanner(System.in);
		System.out.println("What is the physical adress of the project: ");
		String physicaladdress = address.nextLine();

		@SuppressWarnings("resource")
		Scanner erfnumber = new Scanner(System.in);
		System.out.println("What is the ERF number of the project: ");
		String ERFnumber = erfnumber.nextLine();		  

		@SuppressWarnings("resource")
		Scanner totalfee = new Scanner(System.in);
		System.out.println("What is the total fee that will be charged for this project: ");
		double totalfeecharge = totalfee.nextDouble();

		@SuppressWarnings("resource")
		Scanner amount = new Scanner(System.in);
		System.out.println("What is the total amount that must be paid for this project: ");
		double totalamountpaid = amount.nextDouble();		    

		@SuppressWarnings("resource")
		Scanner Deadline = new Scanner(System.in);
		System.out.println("please give the dead line of the project DD/MM/YYYY: ");
		String projectdateline = Deadline.nextLine();
		System.out.println("\n");

		//creating objects of persons
		System.out.println("capturing the Contractor details.\n================================\n");
		persons contractor = getPerInfor();
		System.out.println("\n");

		System.out.println("Capturing the Costomer details. \n==============================");
		persons costomer = getPerInfor();
		System.out.println("\n");

		System.out.println("Capturing the Architect details. \n==============================");
		persons architect = getPerInfor(); 
		System.out.println("\n");

		// creating all the objects of ProjectForm
		return new ProjectForm(projectnumber, projectname, buildingtype, physicaladdress, 
				ERFnumber, totalfeecharge, totalamountpaid, projectdateline, contractor, costomer, architect);
	}

	public static persons getPerInfor(){
		@SuppressWarnings("resource")
		Scanner userSurname = new Scanner(System.in);
		System.out.println("What is the surname of the person: ");
		String Surname = userSurname.nextLine();

		@SuppressWarnings("resource")
		Scanner userName = new Scanner(System.in);
		System.out.println("What are the contacts details of the person: ");
		String Name = userName.nextLine();

		@SuppressWarnings("resource")
		Scanner contact = new Scanner(System.in);
		System.out.println("What is the name of the person: ");
		String contactnumber = contact.nextLine();

		@SuppressWarnings("resource")
		Scanner email = new Scanner(System.in);
		System.out.println("What is the email address of the person: ");
		String emailaddress = email.nextLine();

		@SuppressWarnings("resource")
		Scanner address = new Scanner(System.in);
		System.out.println("What is the the physical address of the person: ");
		String pysaddress = address.nextLine();

		// creating all the objects of persons
		return new persons(Surname, Name, contactnumber, emailaddress, pysaddress);

	}

	public static void main(String[] args) {

		// Initializing getBfInfor into a variable called project
		ProjectForm project = getBFInfor();

		// printing the content of project
		System.out.println(project);

		// creating menu for the project
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("\n================ M E N U ================: \n"
				+ "\n Enter 1 to change the Deadline of the project:"
				+ "\n Enter 2 to change the total amount of the fee paid:"
				+ "\n Enter 3 to change the detials of the contractor:"
				+ "\n Enter 4 to finalise the project");

		// Initializing userinput.netInt() to update project
		int update = userInput.nextInt();

		// if update is equal to 1	
		if (update == 1) {

			// getting input from user
			System.out.println("Enter the new Deadline: ");

			// assigning a variable called date
			@SuppressWarnings("resource")
			Scanner date = new Scanner(System.in);

			// initializing date.netLine to newDeadline which cast to String
			String newDeadline = date.nextLine();

			// setting newDeadline to project
			project.setprojectDeadline(newDeadline);	

			// printing project
			System.out.println(project);

		}

		//else if update is equal to 2
		else if (update == 2) {

			// getting input from the user
			System.out.println("Please enter the new amount fee paid");

			// assigning a variable called fee
			@SuppressWarnings("resource")
			Scanner fee = new Scanner(System.in);

			// initializing fee.netDouble to newAmount which cast to double
			double newAmount = fee.nextDouble();

			// setting newAmount to project
			project.setTotalAmount(newAmount);

			// printing project
			System.out.println(project);
		}

		// if update is equal to 4
		else if (update == 4) {

			// getting the method TotalFeecharge and initialize to total fee
			double totalfee = project.getTotalFeeCharge();

			// getting the method TotalFeecharge and initialize to total amount
			double totalpaid = project.getTotalAmount();

			// getting the difference of total fee and total paid and initialize it to grand total 
			double grandtotal = totalfee - totalpaid;

			// printing the  of the customer 
			System.out.println("costomer reciept. \n=================");

			// printing the get customer method
			System.out.println(project.getCostomer());

			// printing the total fee charge method
			System.out.println("The total fee charge of the project is: "+ project.getTotalFeeCharge());

			// printing the total amount method
			System.out.println("The total amount being paid of the project is: "+ project.getTotalAmount());

			// printing the content of grand total
			System.out.println("The total balance to be paid is: "+ grandtotal);

		}

		//else if update is equal to 3
		else if (update == 3) {

			//  the details of the contractor
			System.out.println("What are details of the new contractor");

			// creating a new scanner menu for the contractor
			@SuppressWarnings("resource")
			Scanner contInput = new Scanner(System.in);
			System.out.println("\n================= M E N U =================: \n"
					+ "\n Enter 1 to change the contractor contact number:"
					+ "\n Enter 2 to change the contractor email address:"
					+ "\n Enter 3 to change the contractor physical address:");


			int sysCont = userInput.nextInt();

			if (sysCont == 1) {

				// getting new contact from the contractor
				System.out.println("Please enter new contact of the contractor");

				// assigning a variable called new contact
				@SuppressWarnings({ "unused", "resource" })
				Scanner newContact = new Scanner(System.in);

				// initializing contInput.netLine to newContractordetails which cast to String
				String newContractordetails = contInput.nextLine();

				// project.getcontractor method which is contractor information and set contractor 
				// number in bracket newContractordetails
				project.getContractor().setContactnumber(newContractordetails);

				// printing the content of project
				System.out.print(project);

			}

			// else if syscont is equal to 2
			else if (sysCont == 2) {

				// getting contractor email address
				System.out.println("Please enter new email address of the contractor");

				// assigning a variable called new email
				@SuppressWarnings({ "unused", "resource" })
				Scanner newEmail = new Scanner(System.in);

				// initializing contInput.netLine to newContractordetails which cast to String
				String newContractordetails = contInput.nextLine();

				// project.getcontractor method which is contractor information and set contractor 
				// email in bracket newContractordetails
				project.getContractor().setPerEmail(newContractordetails);

				// printing the content of project
				System.out.print(project);

			}

			// else if syscont is equal to 3
			else if (sysCont == 3) {

				// getting contractor physical address
				System.out.println("Please enter new physical address of the contractor");

				//  assigning a variable called new address
				@SuppressWarnings({ "unused", "resource" })
				Scanner newAddress = new Scanner(System.in);

				// initializing contInput.netLine to newContractordetails which cast to String
				String newContractordetails = contInput.nextLine();

				// project.getcontractor method which is contractor information and set contractor 
				// physical address in bracket newContractordetails
				project.getContractor().setphysicaladdress(newContractordetails);

				// printing the content of project
				System.out.println(project);
			}

		}
	}		

}

