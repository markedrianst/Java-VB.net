Imports System.IO
Imports System.Windows.Forms.VisualStyles.VisualStyleElement

Public Class SlotsMachine
    Public mny1, jack As Integer
    Dim pic1, pic2, pic3 As Integer
    Public num1, num2, num3 As Integer
    Dim ran As New Random()
    Dim rand As Integer
    Public balance, jackpot As Integer
    Private Sub SlotMachine_Load(sender As Object, e As EventArgs) Handles MyBase.Load
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
        If String.IsNullOrEmpty(BAL.Text) OrElse BAL.Text = 0 Then
            MsgBox("Insert Money first")
        ElseIf balance = 0 Then
            MsgBox("You don't have enough money to play")
        ElseIf balance < BAL.Text Then
            MsgBox("Your bet is bigger than your money")

        Else
            Button1.Enabled = False
            num1 = 0
            num2 = 0
            num3 = 0
            Timer1.Start()
            Timer2.Start()
            Timer3.Start()
        End If
    End Sub
    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick
        num1 += 1
        pic1 = SPIN()
        PictureBox1.Image = Image.FromFile(Path.Combine(Directory.GetCurrentDirectory(), "Fruits", "Fruit" & pic1 & ".png"))
        If num1 = 10 Then
            Timer1.Stop()
        End If
    End Sub
    Private Sub Timer3_Tick(sender As Object, e As EventArgs) Handles Timer3.Tick
        num2 += 1
        pic2 = SPIN()
        PictureBox2.Image = Image.FromFile(Path.Combine(Directory.GetCurrentDirectory(), "Fruits", "Fruit" & pic2 & ".png"))
        If num2 = 20 Then
            Timer3.Stop()
        End If
    End Sub
    Private Sub Timer2_Tick(sender As Object, e As EventArgs) Handles Timer2.Tick
        num3 += 1
        pic3 = SPIN()
        PictureBox3.Image = Image.FromFile(Path.Combine(Directory.GetCurrentDirectory(), "Fruits", "Fruit" & pic3 & ".png"))
        If num3 = 30 Then
            Timer2.Stop()
            Button1.Enabled = True
            Dim Bet As Integer = balance
            If pic1 = pic2 AndAlso pic2 = pic3 Then
                TextBox1.Visible = False
                PictureBox4.Image = My.Resources.Jackpot
                MessageBox.Show("You got 3 pairs")
                TextBox1.Visible = True
                PictureBox4.Image = Nothing
                mny1 = balance + jackpot
                jackpot = 10000
            ElseIf pic1 = pic2 OrElse pic2 = pic3 OrElse pic1 = pic3 Then
                MessageBox.Show("You got 1 pair")
                mny1 = balance + 25
                jackpot = jackpot
            Else
                MessageBox.Show("No Pair")
                mny1 = balance - 25
                jackpot = jackpot + 25
            End If
            TextBox2.Text = jackpot
            balance = mny1
            BAL.Text = Format(balance, "₱ #,##.##")
        End If

    End Sub
    Private Sub SlotsMachine_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        PictureBox1.Image = Image.FromFile(Path.Combine(Directory.GetCurrentDirectory(), "Fruits", "Fruit4" & ".png"))
        PictureBox2.Image = Image.FromFile(Path.Combine(Directory.GetCurrentDirectory(), "Fruits", "Fruit4" & ".png"))
        PictureBox3.Image = Image.FromFile(Path.Combine(Directory.GetCurrentDirectory(), "Fruits", "Fruit4" & ".png"))
    End Sub
    Private Function SPIN()
        rand = ran.Next(0, 5)
        Return rand
    End Function
End Class