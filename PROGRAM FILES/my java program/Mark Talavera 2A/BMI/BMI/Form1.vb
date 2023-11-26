Public Class Form1
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim weight As Double
        Dim height As Double

        If Double.TryParse(txtWeight.Text, weight) AndAlso Double.TryParse(txtHeight.Text, height) Then
            Dim bmi As Double = weight / (height * height)
            lblResult.Text = "Your BMI is: " & bmi.ToString("F2")
            Dim interpretation As String = ""
            If bmi < 18.5 Then
                interpretation = "Underweight"
            ElseIf bmi >= 18.5 AndAlso bmi < 24.9 Then
                interpretation = "Normal"
            ElseIf bmi >= 25 AndAlso bmi < 29.9 Then
                interpretation = "Overweight"
            Else
                interpretation = "Obese"
            End If

            interpretations.Text &= vbCrLf & interpretation
        Else

        End If
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        txtWeight.Text = ""
        txtHeight.Text = ""
        interpretations.Text = ""
        lblResult.Text = ""
    End Sub
End Class
