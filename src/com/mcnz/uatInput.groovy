package com.mcnz

public class uatInput {

  def buildIsUatApproved() {
    def file = new File("C:/Users/X395/Desktop/approved.txt")
    
    if (file.exists()){
      return true;
    }
    else {
      println "Approval file does not exist."
    }
    
    return false;
  }

}
