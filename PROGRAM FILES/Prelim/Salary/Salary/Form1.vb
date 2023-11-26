Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles label1.Click

    End Sub

    Private Sub Label7_Click(sender As Object, e As EventArgs) Handles Label7.Click

    End Sub

    Private Sub Label10_Click(sender As Object, e As EventArgs) Handles Label10.Click

    End Sub

    Private Sub Label22_Click(sender As Object, e As EventArgs) Handles Label22.Click

    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles Namex.TextChanged

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim Name As String = Namex.Text
        Namey.Text = Name

        Dim Department As String = DPx.Text
        DPy.Text = Department

        Dim WH As Double = WHx.Text
        WHy.Text = WH

        Dim RR As Double = RRx.Text
        RRy.Text = RR


        Dim OT As Double = OTx.Text
        OTy.Text = OT


        Dim OTR As Double = OTRx.Text
        OTRy.Text = OTR

        Dim GS As Double = (WH * RR) + (OT * OTR)
        GrossSalary.Text = GS

        Dim SSS As Double = (GS / 0.05)
        sss1.Text = SSS

        Dim PhilHealth As Double = (GS / 150)
        PH.Text = PhilHealth


        Dim Pagibig As Double = (GS / 0.02)
        PI.Text = Pagibig

        Dim tax = (GS / 0.08)
        it.Text = tax









    End Sub

    Private Sub Dp1_TextChanged(sender As Object, e As EventArgs) Handles DPx.TextChanged

    End Sub

    Private Sub ot1_TextChanged(sender As Object, e As EventArgs) Handles OTx.TextChanged

    End Sub

    Private Sub wh1_TextChanged(sender As Object, e As EventArgs) Handles WHx.TextChanged

    End Sub

    Private Sub otr1_TextChanged(sender As Object, e As EventArgs) Handles OTRx.TextChanged

    End Sub

    Private Sub td_TextChanged(sender As Object, e As EventArgs) Handles td.TextChanged

    End Sub

    Private Sub np_TextChanged(sender As Object, e As EventArgs) Handles np.TextChanged

    End Sub

    Private Sub pagibig_TextChanged(sender As Object, e As EventArgs) Handles PI.TextChanged

    End Sub

    Private Sub it_TextChanged(sender As Object, e As EventArgs) Handles it.TextChanged

    End Sub

    Private Sub wh2_TextChanged(sender As Object, e As EventArgs) Handles WHy.TextChanged

    End Sub

    Private Sub ph_TextChanged(sender As Object, e As EventArgs) Handles PH.TextChanged

    End Sub

    Private Sub GrossSalary_TextChanged(sender As Object, e As EventArgs) Handles GrossSalary.TextChanged

    End Sub

    Private Sub rr2_TextChanged(sender As Object, e As EventArgs) Handles RRy.TextChanged

    End Sub

    Private Sub dp2_TextChanged(sender As Object, e As EventArgs) Handles DPy.TextChanged

    End Sub

    Private Sub sss1_TextChanged(sender As Object, e As EventArgs) Handles sss1.TextChanged

    End Sub

    Private Sub otr2_TextChanged(sender As Object, e As EventArgs) Handles OTRy.TextChanged

    End Sub

    Private Sub name2_TextChanged(sender As Object, e As EventArgs) Handles Namey.TextChanged

    End Sub

    Private Sub ot2_TextChanged(sender As Object, e As EventArgs) Handles OTy.TextChanged

    End Sub

    Private Sub rr1_TextChanged(sender As Object, e As EventArgs) Handles RRx.TextChanged

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

    End Sub
End Class
