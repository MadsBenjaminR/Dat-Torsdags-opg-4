class Team {

 private String tname;
 private String pname;
 private int trank;


 public Team (String tname, int trank){

	this.tname=tname;
	this.trank=trank;
  

}
public void setRank(int teamRank){
this.trank=teamRank;

}
public String toString(){
	String s = "Hold: "+this.tname+" Rang "+this.trank;
	
	return s;
}
}