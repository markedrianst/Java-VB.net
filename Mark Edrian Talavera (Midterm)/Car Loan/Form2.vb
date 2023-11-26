Public Class Form2
    Private Sub Form2_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Panel1.BackColor = Color.FromArgb(100, 0, 0, 0)
        Label1.BackColor = Color.FromArgb(0, 0, 0, 0)
        Label2.BackColor = Color.FromArgb(0, 0, 0, 0)
        Label3.BackColor = Color.FromArgb(0, 0, 0, 0)
        Label4.BackColor = Color.FromArgb(0, 0, 0, 0)
        Label5.BackColor = Color.FromArgb(0, 0, 0, 0)
        PictureBox1.BackColor = Color.FromArgb(0, 0, 0, 0)
        PictureBox2.BackColor = Color.FromArgb(0, 0, 0, 0)
        Label6.BackColor = Color.FromArgb(0, 0, 0, 0)
        Label7.BackColor = Color.FromArgb(0, 0, 0, 0)
        PictureBox3.BackColor = Color.FromArgb(0, 0, 0, 0)
    End Sub
    Private Sub Button1_Click_1(sender As Object, e As EventArgs) Handles Cancel.Click
        Dim cancel As DialogResult = MessageBox.Show("Are you sure you want to cancell?", "", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If cancel = DialogResult.Yes Then
            Me.Close()
            Form1.Show()
        End If
    End Sub
    Private Sub Button2_Click_1(sender As Object, e As EventArgs) Handles Compute.Click
        If String.IsNullOrEmpty(YearsTopay.Text) Then
            MessageBox.Show("Please fill the Year(s) to Pay To Process your transaction! ", "Information", MessageBoxButtons.OK, MessageBoxIcon.Information)
        ElseIf YearsTopay.Text = 0 Then
            Dim total As Double = 0
            Dim tots As Double = 0
            Dim ttl As Double = 0
            Dim ttl1 As Double = 0
            total = Price.Text * An.Text
            tots = total * Val(YearsTopay.Text)
            ttl = tots + Price.Text
            TOTALS.Text = Format(ttl, "₱ #,##.00")
            ttl1 = ttl / Val(YearsTopay.Text * 12)
            MonthlyDues.Text = "N/a"
            Compute.Visible = False
            Cancel.Visible = False
            Save.Visible = True
            MessageBox.Show("You have successfully purchased !!", "Information", MessageBoxButtons.OK, MessageBoxIcon.Information)
        Else
            Dim total As Double = 0
            Dim tots As Double = 0
            Dim ttl As Double = 0
            Dim ttl1 As Double = 0
            total = Price.Text * An.Text
            tots = total * Val(YearsTopay.Text)
            ttl = tots + Price.Text
            TOTALS.Text = Format(ttl, "₱ #,##.00")
            ttl1 = ttl / Val(YearsTopay.Text * 12)
            MonthlyDues.Text = Format(ttl1, "₱ #,##.00")
            Compute.Visible = False
            Cancel.Visible = False
            Save.Visible = True
            MessageBox.Show("You have successfully purchased !!", "Information", MessageBoxButtons.OK, MessageBoxIcon.Information)
        End If
    End Sub

    Private Sub Save_Click_1(sender As Object, e As EventArgs) Handles Save.Click
        Dim cancel As DialogResult = MessageBox.Show("Congratulation You have a new car!!", "", MessageBoxButtons.OK, MessageBoxIcon.Question)
        If cancel = DialogResult.OK Then
            Form1.ComboBox1.Text = Nothing
            Form1.ComboBox2.Text = Nothing
            Form1.ComboBox2.Items.Clear()
            Form1.ComboBox2.Enabled = False
            Form1.PictureBox1.Image = My.Resources.Pre_load_removebg_preview
            Form1.PictureBox2.Image = My.Resources.Pre_load_removebg_preview
            Form1.Prc.Text = 0
            Form1.AI.Text = "0%"
            Form1.Label6.Text = 0
            Form1.Show()
            Me.Close()
        End If
    End Sub
End Class