Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Panel1.BackColor = Color.FromArgb(100, 0, 0, 0)
    End Sub
    Private Sub Panel1_Paint(sender As Object, e As PaintEventArgs) Handles Panel1.Paint
        Panel2.BackColor = Color.FromArgb(50, 0, 0, 0)
        Panel3.BackColor = Color.FromArgb(50, 0, 0, 0)
        Panel4.BackColor = Color.FromArgb(50, 0, 0, 0)
        Panel1.BackColor = Color.FromArgb(50, 0, 0, 0)
    End Sub
    Private Sub ComboBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ComboBox1.SelectedIndexChanged
        ComboBox2.Enabled = True
        Dim anual As Double = 0
        Select Case ComboBox1.SelectedIndex
            Case 0
                PictureBox1.Image = My.Resources.Toyota
                PictureBox2.Image = My.Resources.Pre_load_removebg_preview
                ComboBox2.Items.Clear()
                AI.Text = "10 %"
                Label6.Text = 0.1
                Prc.Text = 0.0
                ComboBox2.Items.Add("Avanza")
                ComboBox2.Items.Add("Camry")
                ComboBox2.Items.Add("Altis")
            Case 1
                ComboBox2.Items.Clear()
                PictureBox1.Image = My.Resources.honda
                PictureBox2.Image = My.Resources.Pre_load_removebg_preview
                AI.Text = "11 %"
                Label6.Text = 0.11
                Prc.Text = 0.0
                ComboBox2.Items.Add("City")
                ComboBox2.Items.Add("Jazz")
            Case 2
                ComboBox2.Items.Clear()
                PictureBox1.Image = My.Resources._14197_logo_nissan_cars_transport
                PictureBox2.Image = My.Resources.Pre_load_removebg_preview
                AI.Text = "9 %"
                Label6.Text = 0.09
                Prc.Text = 0.0
                ComboBox2.Items.Add("Senta")
                ComboBox2.Items.Add("Patrol")
            Case 3
                ComboBox2.Items.Clear()
                PictureBox1.Image = My.Resources.kia
                PictureBox2.Image = My.Resources.Pre_load_removebg_preview
                AI.Text = "8 %"
                Label6.Text = 0.08
                Prc.Text = 0.0
                ComboBox2.Items.Add("Rio")
                ComboBox2.Items.Add("Sorento")
        End Select
    End Sub
    Private Sub ComboBox2_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ComboBox2.SelectedIndexChanged
        If ComboBox1.SelectedIndex = 0 Then
            Select Case ComboBox2.SelectedIndex
                Case 0
                    PictureBox2.Image = My.Resources.Avanza
                    Prc.Text = Format(1059000, "₱ #,##.00")
                Case 1
                    PictureBox2.Image = My.Resources.Camry
                    Prc.Text = Format(2457000, "₱ #,##.00")
                Case 2
                    PictureBox2.Image = My.Resources.Altis
                    Prc.Text = Format(1302000, "₱ #,##.00")
            End Select
        ElseIf ComboBox1.SelectedIndex = 1 Then
            Select Case ComboBox2.SelectedIndex
                Case 0
                    PictureBox2.Image = My.Resources.City
                    Prc.Text = Format(1128000, "₱ #,##.00")
                Case 1
                    PictureBox2.Image = My.Resources.jazz
                    Prc.Text = Format(1090000, "₱ #,##.00")
            End Select
        ElseIf ComboBox1.SelectedIndex = 2 Then
            Select Case ComboBox2.SelectedIndex
                Case 0
                    PictureBox2.Image = My.Resources.Senta
                    Prc.Text = Format(1307580, "₱ #,##.00")
                Case 1
                    PictureBox2.Image = My.Resources.Patrol
                    Prc.Text = Format(4698000, "₱ #,##.00")
            End Select
        ElseIf ComboBox1.SelectedIndex = 3 Then
            Select Case ComboBox2.SelectedIndex
                Case 0
                    PictureBox2.Image = My.Resources.Rio
                    Prc.Text = Format(985000, "₱ #,##.00")
                Case 1
                    PictureBox2.Image = My.Resources.sorento
                    Prc.Text = Format(2638000, "₱ #,##.00")
            End Select
        End If
    End Sub
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If ComboBox1.SelectedIndex = -1 OrElse ComboBox2.SelectedIndex = -1 Then
            MessageBox.Show("Plese Select  Car Brand and Car Model ", "Information", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        Else
            Dim myForm2 As New Form2()
            Dim img1 As Image = PictureBox1.Image
            Dim img As Image = PictureBox2.Image
            myForm2.PictureBox1.Image = img
            myForm2.PictureBox2.Image = img1
            myForm2.Price.Text = Prc.Text
            myForm2.AnnualInterest.Text = AI.Text
            myForm2.An.Text = Label6.Text
            myForm2.TextBox7.Text = ComboBox1.SelectedItem
            myForm2.TextBox6.Text = ComboBox2.SelectedItem
            myForm2.Show()
            Me.Hide()
        End If
    End Sub
    Private Sub Form1_FormClosing(sender As Object, e As FormClosingEventArgs) Handles MyBase.FormClosing
        Dim result As DialogResult = MessageBox.Show("Do you want to close this form?", "Close Form", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If result = DialogResult.No Then
            e.Cancel = True
        Else
        End If
    End Sub
End Class