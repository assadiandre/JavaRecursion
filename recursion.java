
// Triangle

public int triangle(int rows) {
  if (rows == 0) return 0;
  return rows + triangle(rows-1);
}

// Fibonacci

public int fibonacci(int n) {
  if (n == 0) return 0;
  else if (n == 1) return 1;
  
  return fibonacci(n - 2) + fibonacci(n - 1);
}

// CountHi

public int countHi(String str) {
  
  if (str.length() <= 1) {
    return 0;
  }
  else if (str.substring(0,2).equals("hi")) {
    return 1 + countHi(str.substring(1));
  } 
  else {
    return countHi( str.substring(1) );
  } 

}


// SumDigits

public int sumDigits(int n) {
  if (n <= 9) return n; 
  return (n % 10) + sumDigits( n / 10);
}


/// OTHER FOUR:

// CountX

public int countX(String str) {
  if (str.length() == 0) return 0; 
  if (str.charAt(0) == 'x') return 1 + countX( str.substring(1) );
  
  return countX( str.substring(1) );
  
}


// ChangePi

public String changePi(String str) {
  
  if (str.length() <= 1) {
    return str;
  }
  else if (str.substring(0,2).equals("pi") ) {
    return "3.14" + changePi(str.substring(2)) ;
  }
  else {
    return str.substring(0,1) + changePi(str.substring(1));
  }
  
  
  
}

// ChangeXY

public String changeXY(String str) {

  if ( str.length() == 0 ) {
    return str;
  }
  else if (str.substring(0,1).equals("x") ) {
    return "y" + changeXY(str.substring(1) );
  }
  else {
    return str.substring(0,1) + changeXY(str.substring(1) );
  }
  
  
}


// PowerN


public int powerN(int base, int n) {
  if (n == 0) return 1;
  return base * powerN(base, n - 1);
}





