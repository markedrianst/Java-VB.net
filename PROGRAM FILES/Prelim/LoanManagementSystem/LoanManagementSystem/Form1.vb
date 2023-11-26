

Public Class Form1
    Dim LRN As Integer = 1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim clear As String = ""

        an1.Text = clear
        an2.Text = clear
        ytp1.Clear()
        ytp2.Clear()
        name1.Clear()
        name2.Clear()
        ir1.Clear()
        ir2.Clear()
        tap2.Clear()
        TI2.Clear()
        tlp2.Clear()
        mp2.Clear()
        al2.Clear()
        ad1.Clear()
        ad2.Clear()


        LRN += 1

        Dim NewLRN = "0000" & LRN
        lr1.Text = NewLRN
        lr2.Text = NewLRN



        name1.Text = clear


        tap2.Text = clear


    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click

        Dim ir As Double = ir1.Text
        Dim al As Double = al1.Text
        Dim ytp As Double = ytp1.Text


        Dim name As String = name1.Text
        name2.Text = name


        an2.Text = an1.Text

        Dim ad As String = ad1.Text
        ad2.Text = ad
        Dim amountloan As String = al1.Text
        al2.Text = amountloan

        Dim interest As String = ir1.Text
        ir2.Text = interest
        Dim yrstp As String = ytp1.Text
        ytp2.Text = yrstp


        Dim loan As String = lr1.Text
        lr2.Text = loan






        Dim TI = (al * (ir / 100) * ytp)
        TI2.Text = Format(TI, "#,##.00")

        Dim tlp = al + TI
        tlp2.Text = Format(tlp, "#,##.00")

        Dim tap = tlp / ytp
        tap2.Text = Format(tap, "#,##.00")

        Dim mp = tap / 12
        mp2.Text = Format(mp, "#,##.00")







    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub lr1_TextChanged(sender As Object, e As EventArgs) Handles lr1.TextChanged

    End Sub
End Class
