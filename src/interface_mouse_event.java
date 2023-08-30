import java.awt.*;

class AWTDemo extends Frame {

  AWTDemo() {
    Label empName = new Label("Emp Name");
    empName.setBounds(20, 50, 80, 20);

    Label post = new Label("Post");
    post.setBounds(20, 80, 80, 20);

    Label salary = new Label("Salary");
    salary.setBounds(20, 110, 80, 20);

    TextField empNameTF = new TextField();
    empNameTF.setBounds(120, 50, 100, 20);

    TextField postTF = new TextField();
    postTF.setBounds(120, 100, 100, 20);

    TextField salaryTF = new TextField();
    salaryTF.setBounds(120, 110, 100, 20);

    Button sbmt = new Button(Submit);
    sbmt.setBounds(120, 150, 100, 20);

    Button reset = new Button(reset);
    reset.setBounds(150, 150, 100, 20);

    add(empName);
    add(post);
    add(salary);
    add(empNameTF);
    add(postTF);
    add(salaryTF);
    add(sbmt);
    add(reset);

    setSize(300, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    AWTDemo demo = new AWTDemo();
  }
}
