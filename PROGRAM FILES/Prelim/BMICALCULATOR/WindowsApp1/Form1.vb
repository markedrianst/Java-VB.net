Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub Label4_Click(sender As Object, e As EventArgs) Handles Label4.Click

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim BMIx As Double
        Dim H As Double
        Dim W As Double

        H = Height.Text
        W = Weight.Text
        Dim meter As Double

        meter = H / 100
        BMIx = W / (meter * meter)
        BMI.Text = Math.Round(BMIx, 2)


        If BMIx < 15 Then
            BMIC.Text = "Very Severely Underweight"
        ElseIf BMIx >= 15 And BMIx <= 16 Then
            BMIC.Text = "Severely Underweight"
        ElseIf BMIx >= 16.5 And BMIx <= 18 Then
            BMIC.Text = "Underweight"
        ElseIf BMIx >= 18.5 And BMIx < 25 Then
            BMIC.Text = "Normal(healthy)"
        ElseIf BMIx >= 20 And BMIx < 30 Then
            BMIC.Text = "Overweight"
        ElseIf BMIx >= 30 And BMIx < 35 Then
            BMIC.Text = "Moderately Obese"
        ElseIf BMIx >= 35 And BMIx < 40 Then
            BMIC.Text = "Severely Obese"
        ElseIf BMIx > 40 Then
            BMIC.Text = "Very Severely Obese"





        End If






    End Sub

    Private Sub height_GotFocus(sender As Object, e As EventArgs) Handles Weight.GotFocus
        If Weight.Text = "KG" Then
            Weight.Clear()
            Weight.ForeColor = Color.Black
        End If
    End Sub

    Private Sub height_LostFocus(sender As Object, e As EventArgs) Handles Weight.LostFocus
        If Weight.Text = "" Then
            Weight.Text = "KG"
            Weight.ForeColor = Color.Black

        End If

    End Sub

    Private Sub weight_GotFocus(sender As Object, e As EventArgs) Handles Height.GotFocus
        If Height.Text = "CM" Then
            Height.Clear()
            Height.ForeColor = Color.Black
        End If
    End Sub

    Private Sub weight_LostFocus(sender As Object, e As EventArgs) Handles Height.LostFocus
        If Height.Text = "" Then
            Height.Text = "CM"
            Height.ForeColor = Color.Black
        End If
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim clear As String = ""

        Height.Text = "CM"
        Height.ForeColor = Color.Black
        Weight.Text = "KG"
        Weight.ForeColor = Color.Black
        BMIC.Text = clear
        BMIC.ForeColor = Color.Black
        BMI.Text = clear
        BMI.ForeColor = Color.Black


    End Sub

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles Label1.Click

    End Sub

    Private Sub weight_TextChanged(sender As Object, e As EventArgs) Handles Weight.TextChanged

    End Sub

    Private Sub BMI_TextChanged(sender As Object, e As EventArgs) Handles BMI.TextChanged

    End Sub

    Private Sub height_TextChanged(sender As Object, e As EventArgs) Handles Height.TextChanged

    End Sub

    Private Sub BC_TextChanged(sender As Object, e As EventArgs) Handles BMIC.TextChanged

    End Sub
End Class
