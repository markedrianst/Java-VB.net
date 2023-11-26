Imports System.IO
Imports System.Security.Policy
Imports System.Windows.Forms.VisualStyles.VisualStyleElement

Public Class TossCoin
    Public balance As Double
    Public total As Integer
    Dim num As Integer
    Dim num1 As Integer
    Dim ran As New Random
    Private Sub ComboBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ComboBox1.SelectedIndexChanged
        PictureBox1.Image = Image.FromFile(Directory.GetCurrentDirectory & "\TossCoin\Toss" & ComboBox1.SelectedIndex & ".png")
    End Sub

    Private Sub Coin_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        PictureBox1.Image = My.Resources.images_removebg_preview__1_
        PictureBox2.Image = My.Resources.images_removebg_preview__1_
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim back As DialogResult = MessageBox.Show("Are you sure you want to quit??", "Questioning", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If back = DialogResult.Yes Then
            PickGame.amount3 = balance
            PickGame.Label1.Text = Format(balance, "₱ #,##.##")
            PickGame.Show()
            Me.Close()
        End If
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

        If ComboBox1.SelectedIndex = -1 Then
            MsgBox("Please select a coin first.")
        ElseIf Not IsNumeric(TextBox1.Text) OrElse String.IsNullOrEmpty(TextBox1.Text) Then
            MsgBox("Place your bet first !")
        ElseIf balance = 0 Then
            MsgBox("You dont have enough money to play")
        ElseIf balance < TextBox1.Text Then
            MsgBox("Your bet is bigger than your money")
        ElseIf TextBox1.Text.Contains(".") Then
            MsgBox("Whole numbers only")
        Else
            ComboBox1.Enabled = False
            TextBox1.Enabled = False
            num1 = 0
            Timer1.Start()
        End If
    End Sub

    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick
        num1 += 1
        num = ran.Next(0, 2)
        PictureBox2.Image = Image.FromFile(Directory.GetCurrentDirectory & "\TossCoin\Toss" & num & ".png")
        If num1 = 20 Then
            Timer1.Stop()
            ComboBox1.Enabled = True
            TextBox1.Enabled = True
            If ComboBox1.SelectedIndex = num Then
                MessageBox.Show("You Win")
                total = TextBox1.Text + balance
            Else
                MessageBox.Show("You Lose")
                total = balance - TextBox1.Text
            End If
            balance = total
            Label1.Text = Format(balance, "₱ #,##.##")
        End If
    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged

    End Sub
End Class

