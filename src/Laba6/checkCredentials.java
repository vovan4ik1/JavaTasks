package Laba6;

class WrongPassswordException extends Exception {
  public WrongPassswordException(String message) {
    super(message);
  }
  public WrongPassswordException() {
    super("Wrong password");
  }
}

class WrongLoginException extends Exception {
  public WrongLoginException(String message) {
    super(message);
  }
  public WrongLoginException() {
    super("Wrong login");
  }
}

public class checkCredentials {
  public static boolean checkCredentials(String login, String password, String confirmPassword) {
    try {
      if (login == null || !login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
        throw new WrongLoginException("Password must contain only latin letters, digits, and underscores, and be less than 20 characters.");
      }

      if (password == null || !password.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
        throw new WrongPassswordException("Password must contain only latin letters, digits, and underscores, and be less than 20 characters.");
      }

      if(!password.equals(confirmPassword)) {
        throw new WrongPassswordException("Passwords do not match");
      }

      return true;
    }catch (WrongLoginException | WrongPassswordException e){
      System.out.println("Error: " + e.getMessage());
      return false;
    } 
  }

  public static void main (String[] args) {
    System.err.println(checkCredentials("Vovan14", "Volod567", "Volod567"));
    System.err.println(checkCredentials("Vovan14", "Volod567", "Volod"));
    System.err.println(checkCredentials("Vovan14", "Volod1", "Volod1"));
    System.err.println(checkCredentials("амттапиа", "Volod567", "Volod567"));
  }
}