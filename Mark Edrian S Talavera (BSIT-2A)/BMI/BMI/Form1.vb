Imports System.Net
Imports System.Reflection

Public Class Form1
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click



        If String.IsNullOrEmpty(txtWeight.Text) OrElse String.IsNullOrEmpty(txtHeight.Text) Then
            MessageBox.Show("Please fill out all required fields.", "Incomplete Information", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        ElseIf Not IsNumeric(txtWeight.Text) OrElse Not IsNumeric(txtWeight.Height) Then
            MessageBox.Show("Please Fill up Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        Else
            lblResult.Text = (Val(txtWeight.Text)) / (Val(txtHeight.Text) / 100 * (Val(txtHeight.Text) / 100))
            If Val(lblResult.Text) < 15 Then
                lblResult.Text = "Less than 15"
                interpretations.Text = "Very Severely Underweight"
            ElseIf Val(lblResult.Text) > 15 AndAlso Val(lblResult.Text) < 16 Then
                lblResult.Text = "Between 15 and 16"
                interpretations.Text = "Severey Underweight"
            ElseIf Val(lblResult.Text) > 16 AndAlso Val(lblResult.Text) < 18.5 Then
                lblResult.Text = "Between 16 and 18.5"
                interpretations.Text = "Underweight"
            ElseIf Val(lblResult.Text) > 18.5 AndAlso Val(lblResult.Text) < 25 Then
                lblResult.Text = "Between 18.5 and 25"
                interpretations.Text = "Normal"
            ElseIf Val(lblResult.Text) > 25 AndAlso Val(lblResult.Text) < 30 Then
                lblResult.Text = "Between 25 and 30"
                interpretations.Text = "Overweight"
            ElseIf Val(lblResult.Text) > 30 AndAlso Val(lblResult.Text) < 35 Then
                lblResult.Text = "Between 30 and 35"
                interpretations.Text = "Moderely Obese"
            ElseIf Val(lblResult.Text) > 35 AndAlso Val(lblResult.Text) < 40 Then
                lblResult.Text = "Between 35 and 40"
                interpretations.Text = "Severey Obese"
            Else
                lblResult.Text = "Over 40"
                interpretations.Text = "Very Severely Obese"
            End If
        End If
    End Sub
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If String.IsNullOrEmpty(txtWeight.Text) OrElse String.IsNullOrEmpty(txtHeight.Text) Then
            MessageBox.Show("You Don't Have To Clear", "Incomplete Information", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        Else
            Dim result As DialogResult = MessageBox.Show("Are you sure You want to clear?", "Confirmation", MessageBoxButtons.YesNo)
            If result = DialogResult.Yes Then
                txtWeight.Text = ""
                txtHeight.Text = ""
                interpretations.Text = ""
                lblResult.Text = ""
            End If

        End If
    End Sub
End Class
