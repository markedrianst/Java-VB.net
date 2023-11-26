Imports System.IO
Imports System.Security.Policy
Imports System.Windows.Forms.VisualStyles.VisualStyleElement.Rebar
Imports System.Windows.Forms.VisualStyles.VisualStyleElement.TextBox
Public Class JackAndPoy
    Public balance As Double
    Dim rand1 As New Random()
    Dim ran1 As Integer
    Dim rand As New Random()
    Dim ran As Integer
    Private Sub Jack_Poy_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        PictureBox8.Image = My.Resources.giphy
        ran1 = rand1.Next(0, 5)
        PictureBox2.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Avatars\Avatar" & ran1 & ".png")
    End Sub
    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        Dim back As DialogResult = MessageBox.Show("Are you sure you want to quit??", "Questioning", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If back = DialogResult.Yes Then
            PickGame.amount3 = balance
            PickGame.Label1.Text = Format(balance, "₱ #,##.##")
            PickGame.Show()
            Me.Close()
        End If
    End Sub
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If Not IsNumeric(TextBox2.Text) OrElse String.IsNullOrEmpty(TextBox2.Text) Then
            MsgBox("Bet First")
        ElseIf balance = 0 Then
            MsgBox("You don't have enough money to play")
        ElseIf CInt(TextBox2.Text) > balance Then
            MsgBox("Your bet is bigger than your money")
        ElseIf TextBox2.Text.Contains(".") Then
            MsgBox("Whole numbers only")
        Else
            UserPick.Image = My.Resources.jack0
            UserPick.Tag = 0
            ran = rand.Next(0, 3)
            Compick.Image = Image.FromFile(Directory.GetCurrentDirectory & "\jackpoy\jack" & ran & ".png")
            Dim userP As Integer = CInt(UserPick.Tag)
            Dim CompP As Integer = ran
            Dim ptmoney As Integer
            If CompP = userP Then
                MsgBox("It's a tie!")
                UserPick.Image = Nothing
                Compick.Image = Nothing
                ptmoney = balance
            ElseIf (userP = 0 And CompP = 1) Or (userP = 1 And CompP = 2) Or (userP = 2 And CompP = 0) Then
                MsgBox("You Win!")
                UserPick.Image = Nothing
                Compick.Image = Nothing
                If Integer.TryParse(TextBox2.Text, ptmoney) Then
                    ptmoney = balance + TextBox2.Text
                End If
            Else
                If Integer.TryParse(TextBox2.Text, ptmoney) Then
                    MsgBox("You Lose!")
                    UserPick.Image = Nothing
                    Compick.Image = Nothing
                    ptmoney = balance - TextBox2.Text
                End If
            End If
            balance = ptmoney
            TextBox1.Text = Format(balance, "₱ #,##.##")
        End If
    End Sub
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click

        If Not IsNumeric(TextBox2.Text) OrElse String.IsNullOrEmpty(TextBox2.Text) Then
            MsgBox("Bet First")
        ElseIf balance = 0 Then
            MsgBox("You don't have enough money to play")
        ElseIf CInt(TextBox2.Text) > balance Then
            MsgBox("Your bet is bigger than your money")
        ElseIf TextBox2.Text.Contains(".") Then
            MsgBox("Whole numbers only")
        Else
            ran = rand.Next(0, 3)
            UserPick.Image = My.Resources.jack2
            UserPick.Tag = 2
            Compick.Image = Image.FromFile(Directory.GetCurrentDirectory & "\jackpoy\jack" & ran & ".png")

            Dim userP As Integer = CInt(UserPick.Tag)
            Dim CompP As Integer = ran
            Dim ptmoney As Integer

            If CompP = userP Then
                MsgBox("It's a tie!")
                UserPick.Image = Nothing
                Compick.Image = Nothing
                ptmoney = balance
            ElseIf (userP = 0 And CompP = 1) Or (userP = 1 And CompP = 2) Or (userP = 2 And CompP = 0) Then
                MsgBox("You Win!")
                UserPick.Image = Nothing
                Compick.Image = Nothing
                If Integer.TryParse(TextBox2.Text, ptmoney) Then
                    ptmoney = balance + TextBox2.Text
                End If
            Else
                If Integer.TryParse(TextBox2.Text, ptmoney) Then
                    MsgBox("You Lose!")
                    UserPick.Image = Nothing
                    Compick.Image = Nothing
                    ptmoney = balance - TextBox2.Text
                End If
            End If
            balance = ptmoney
            TextBox1.Text = Format(balance, "₱ #,##.##")
        End If
    End Sub
    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        If Not IsNumeric(TextBox2.Text) OrElse String.IsNullOrEmpty(TextBox2.Text) Then
            MsgBox("Bet First")
        ElseIf balance = 0 Then
            MsgBox("You don't have enough money to play")
        ElseIf CInt(TextBox2.Text) > balance Then
            MsgBox("Your bet is bigger than your money")
        ElseIf TextBox2.Text.Contains(".") Then
            MsgBox("Whole numbers only")
        Else
            ran = rand.Next(0, 3)
            UserPick.Tag = 1
            UserPick.Image = My.Resources.jack1
            Compick.Image = Image.FromFile(Directory.GetCurrentDirectory & "\jackpoy\jack" & ran & ".png")
            Dim userP As Integer = CInt(UserPick.Tag)
            Dim CompP As Integer = ran
            Dim ptmoney As Integer
            If CompP = userP Then
                MsgBox("It's a tie!")
                UserPick.Image = Nothing
                Compick.Image = Nothing
                ptmoney = balance
            ElseIf (userP = 0 And CompP = 1) Or (userP = 1 And CompP = 2) Or (userP = 2 And CompP = 0) Then
                MsgBox("You Win!")
                UserPick.Image = Nothing
                Compick.Image = Nothing
                If Integer.TryParse(TextBox2.Text, ptmoney) Then
                    ptmoney = balance + TextBox2.Text
                End If
            Else
                If Integer.TryParse(TextBox2.Text, ptmoney) Then
                    MsgBox("You Lose!")
                    UserPick.Image = Nothing
                    Compick.Image = Nothing
                    ptmoney = balance - TextBox2.Text
                End If
            End If
            balance = ptmoney
            TextBox1.Text = Format(balance, "₱ #,##.##")
        End If
    End Sub

    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick

    End Sub
End Class