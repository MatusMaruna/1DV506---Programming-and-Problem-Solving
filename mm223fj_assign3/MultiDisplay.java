package mm223fj_assign3;

public class MultiDisplay {
	private int n = 0;
	private String msg =""; 
	

public void display(String x, int n){ 
	msg = x; 
	if(n<0){ 
		System.err.println("You need to have atleast one print out");
	}else{ 
	for(int i = 0; i<n; i++ ){ 
		System.out.println(msg);	 
	}	
}

}
public void display(){
	for(int i = 0; i<n; i++ ){ 
		System.out.println(msg);
}
} 
public void setDisplayCount(int x) { 
	if(n<0){ 
		System.err.println("You need to have atleast one print out");
	}else{ 
	n = x; 
	}
}
public void setDisplayMessage(String x){  
	msg = x; 

}
public String getDisplayMessage(){
	return msg;  
	
}
}
