package mypack;
import java.math.*;
import java.util.*;

public class BigInteg{
	private BigInteger BigInt;
	private  ArrayList<BigInteger> BigInts = new ArrayList<BigInteger>();
	 public BigInteg(String BigInt) throws NumberFormatException{
		try{
			this.BigInt = new BigInteger(BigInt);
			BigInts.add(this.BigInt);
		}
		 catch(NumberFormatException e){
			System.out.println("Введены некорректные данные первой операнды");
			System.exit(0);
		}
	 }
	 
	 public BigInteger sum(String operand) throws NumberFormatException{
		BigInts.add(new BigInteger(operand));
		return BigInts.get(0).add(BigInts.get(BigInts.size()-1));
	 }
	 public BigInteger diff(String operand) throws NumberFormatException{
		BigInts.add(new BigInteger(operand));
		return BigInts.get(0).subtract(BigInts.get(BigInts.size()-1));
	 }
	 public BigInteger multiply(String operand) throws NumberFormatException{
		BigInts.add(new BigInteger(operand));
		return BigInts.get(0).multiply(BigInts.get(BigInts.size()-1));
	 }
	 public void display(){
		 System.out.println(BigInts);
	 }
}