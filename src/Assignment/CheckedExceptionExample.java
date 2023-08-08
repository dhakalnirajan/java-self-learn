class CheckedExceptionExample {

  public static void main(String[] args) throws IOException {
    try {
      FileInputStream fileInputStream = new FileInputStream("myFile.txt");
      int data = fileInputStream.read();
      System.out.println(data);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
/*
In this program, the main() method tries to open a file called myFile.txt and read data from it.
If the file does not exist, or if there is an error reading the file, an IOException exception will
be thrown. The throws clause of the main() method tells the compiler that the method may throw an
IOException exception. This means that the caller of the main() method must either handle the
exception or re-throw it.
*/
