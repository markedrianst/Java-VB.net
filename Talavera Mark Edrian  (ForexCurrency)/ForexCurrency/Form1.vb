
Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Close1.Click
        Dim result As DialogResult = MessageBox.Show("Are you sure You want to Exit?", "Confirmation", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If result = DialogResult.Yes Then
            Me.Close()
        End If
    End Sub
    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Minimize.Click
        Me.WindowState = FormWindowState.Minimized
    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click

        Dim S1 As String = Selection1.SelectedItem
        Dim S2 As String = Selection2.SelectedItem
        If String.IsNullOrEmpty(S1) Then
            MessageBox.Show("Please select to convert in  ComboBox.")
        ElseIf String.IsNullOrEmpty(S1) Then
            MessageBox.Show("Please select to convert in  ComboBox.")

        ElseIf String.IsNullOrEmpty(input.Text) Then
            MessageBox.Show("Please input number.", "Error!!", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        Else
            If S1 = "US DOLLAR" Then

                If S2 = "HKG DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 7.82392, "#,##.00")
                ElseIf S2 = "CND DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 1.3628, "#,##.00")
                ElseIf S2 = "IND RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 83.2362, "#,##.00")
                ElseIf S2 = "SRL RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 324.25, "#,##.00")
                ElseIf S2 = "UAE DINAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 3.6179, "#,##.00")
                ElseIf S2 = "PHP PESO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 56.76, "#,##.00")
                ElseIf S2 = "UK POUND" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.819538, "#,##.00")
                ElseIf S2 = "JPN YEN" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 149.548, "#,##.00")
                ElseIf S2 = "EURO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.9489, "#,##.00")
                ElseIf S2 = "US DOLLOR" Then
                    ConvertedAmount.Text = input.Text
                Else
                    ConvertedAmount.Text = input.Text
                End If

            ElseIf S1 = "HKG DOLLAR" Then

                If S2 = "HKG DOLLAR" Then
                    ConvertedAmount.Text = input.Text
                ElseIf S2 = "US DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.13, "#,##.00")
                ElseIf S2 = "CND DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.17, "#,##.00")
                ElseIf S2 = "IND RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 10.64, "#,##.00")
                ElseIf S2 = "SRL RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 41.42, "#,##.00")
                ElseIf S2 = "UAE DINAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.47, "#,##.00")
                ElseIf S2 = "PHP PESO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 7.25, "#,##.00")
                ElseIf S2 = "UK POUND" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.1, "#,##.00")
                ElseIf S2 = "JPN YEN" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 19.14, "#,##.00")
                ElseIf S2 = "EURO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.12, "#,##.00")
                Else
                    ConvertedAmount.Text = input.Text

                End If

            ElseIf S1 = "CND DOLLAR" Then

                If S2 = "CND DOLLAR" Then
                    ConvertedAmount.Text = input.Text
                ElseIf S2 = "US DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.73, "#,##.00")
                ElseIf S2 = "HKG DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 5.74, "#,##.00")
                ElseIf S2 = "IND RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 61.04, "#,##.00")
                ElseIf S2 = "SRL RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 237.61, "#,##.00")
                ElseIf S2 = "UAE DINAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 2.69, "#,##.00")
                ElseIf S2 = "PHP PESO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 41.56, "#,##.00")
                ElseIf S2 = "UK POUND" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.60148, "#,##.00")
                ElseIf S2 = "JPN YEN" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 109.78, "#,##.00")
                ElseIf S2 = "EURO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.69, "#,##.00")
                Else
                    ConvertedAmount.Text = input.Text

                End If

            ElseIf S1 = "IND RUPEE" Then

                If S2 = "IND RUPEE" Then
                    ConvertedAmount.Text = input.Text
                ElseIf S2 = "US DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.012, "#,##.00")
                ElseIf S2 = "HKG DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.094, "#,##.00")
                ElseIf S2 = "CND DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.016, "#,##.00")
                ElseIf S2 = "SRL RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 3.89, "#,##.00")
                ElseIf S2 = "UAE DINAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.044, "#,##.00")
                ElseIf S2 = "PHP PESO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.68, "#,##.00")
                ElseIf S2 = "UK POUND" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.009885, "#,##.00")
                ElseIf S2 = "JPN YEN" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 1.8, "#,##.00")
                ElseIf S2 = "EURO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.011, "#,##.00")
                Else
                    ConvertedAmount.Text = input.Text

                End If

            ElseIf S1 = "SRL RUPEE" Then

                If S2 = "SRL RUPEE" Then
                    ConvertedAmount.Text = input.Text
                ElseIf S2 = "US DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.0031, "#,##.00")
                ElseIf S2 = "HKG DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.024, "#,##.00")
                ElseIf S2 = "CND DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.0042, "#,##.00")
                ElseIf S2 = "IND RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.26, "#,##.00")
                ElseIf S2 = "UAE DINAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.011, "#,##.00")
                ElseIf S2 = "PHP PESO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.17, "#,##.00")
                ElseIf S2 = "UK POUND" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.0025, "#,##.00")
                ElseIf S2 = "JPN YEN" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.46, "#,##.00")
                ElseIf S2 = "EURO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.0029, "#,##.00")
                Else
                    ConvertedAmount.Text = input.Text

                End If

            ElseIf S1 = "UAE DINAR" Then

                If S2 = "UAE DINAR" Then
                    ConvertedAmount.Text = input.Text
                ElseIf S2 = "US DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.27, "#,##.00")
                ElseIf S2 = "HKG DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 2.13, "#,##.00")
                ElseIf S2 = "CND DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.37, "#,##.00")
                ElseIf S2 = "IND RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 22.67, "#,##.00")
                ElseIf S2 = "SRL RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 88.23, "#,##.00")
                ElseIf S2 = "PHP PESO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 15.43, "#,##.00")
                ElseIf S2 = "UK POUND" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.22, "#,##.00")
                ElseIf S2 = "JPN YEN" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 40.77, "#,##.00")
                ElseIf S2 = "EURO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.26, "#,##.00")
                Else
                    ConvertedAmount.Text = input.Text

                End If

            ElseIf S1 = "PHP PESO" Then

                If S2 = "PHP PESO" Then
                    ConvertedAmount.Text = input.Text
                ElseIf S2 = "US DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.018, "#,##.00")
                ElseIf S2 = "HKG DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.14, "#,##.00")
                ElseIf S2 = "CND DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.024, "#,##.00")
                ElseIf S2 = "IND RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 1.47, "#,##.00")
                ElseIf S2 = "SRL RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 5.72, "#,##.00")
                ElseIf S2 = "UAE DINAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.065, "#,##.00")
                ElseIf S2 = "UK POUND" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.014, "#,##.00")
                ElseIf S2 = "JPN YEN" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 40.77, "#,##.00")
                ElseIf S2 = "EURO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.017, "#,##.00")
                Else
                    ConvertedAmount.Text = input.Text

                End If

            ElseIf S1 = "UK POUND" Then

                If S2 = "UK POUND" Then
                    ConvertedAmount.Text = input.Text
                ElseIf S2 = "US DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.017, "#,##.00")
                ElseIf S2 = "HKG DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 9.54, "#,##.00")
                ElseIf S2 = "CND DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 1.66, "#,##.00")
                ElseIf S2 = "IND RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 101.56, "#,##.00")
                ElseIf S2 = "SRL RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 395.36, "#,##.00")
                ElseIf S2 = "UAE DINAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 4.48, "#,##.00")
                ElseIf S2 = "PHP PESO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 69.14, "#,##.00")
                ElseIf S2 = "JPN YEN" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 182.61, "#,##.00")
                ElseIf S2 = "EURO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 1.15, "#,##.00")
                Else
                    ConvertedAmount.Text = input.Text

                End If


            ElseIf S1 = "JPN YEN" Then

                If S2 = "JPN YEN" Then
                    ConvertedAmount.Text = input.Text
                ElseIf S2 = "US DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.0067, "#,##.00")
                ElseIf S2 = "HKG DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.052, "#,##.00")
                ElseIf S2 = "CND DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.0091, "#,##.00")
                ElseIf S2 = "IND RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.56, "#,##.00")
                ElseIf S2 = "SRL RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 2.16, "#,##.00")
                ElseIf S2 = "UAE DINAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.025, "#,##.00")
                ElseIf S2 = "PHP PESO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.38, "#,##.00")
                ElseIf S2 = "UK POUND" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.0055, "#,##.00")
                ElseIf S2 = "EURO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.0063, "#,##.00")
                Else
                    ConvertedAmount.Text = input.Text

                End If

            ElseIf S1 = "EURO" Then

                If S2 = "EURO" Then
                    ConvertedAmount.Text = input.Text
                ElseIf S2 = "US DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 1.06, "#,##.00")
                ElseIf S2 = "HKG DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 8.28, "#,##.00")
                ElseIf S2 = "CND DOLLAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 1.44, "#,##.00")
                ElseIf S2 = "IND RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 88.16, "#,##.00")
                ElseIf S2 = "SRL RUPEE" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 343.18, "#,##.00")
                ElseIf S2 = "UAE DINAR" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 3.89, "#,##.00")
                ElseIf S2 = "PHP PESO" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 60.0, "#,##.00")
                ElseIf S2 = "UK POUND" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 0.87, "#,##.00")
                ElseIf S2 = "JPN YEN" Then
                    ConvertedAmount.Text = Format(Val(input.Text) * 158.49, "#,##.00")
                Else
                    ConvertedAmount.Text = input.Text

                End If

            End If
        End If
    End Sub
    Private Sub Panel3_Paint(sender As Object, e As PaintEventArgs) Handles transparent.Paint
        transparent.BackColor = Color.FromArgb(110, 0, 0, 0)
    End Sub
    Private Sub Selection1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles Selection1.SelectedIndexChanged
        Selection2.Enabled = True
        Select Case Selection1.SelectedIndex
            Case 0
                PictureBox1.Image = My.Resources.USA
            Case 1
                PictureBox1.Image = My.Resources.Hongkong
            Case 2
                PictureBox1.Image = My.Resources.Canada
            Case 3
                PictureBox1.Image = My.Resources.India
            Case 4
                PictureBox1.Image = My.Resources.Sri_Lanka
            Case 5
                PictureBox1.Image = My.Resources.UAE
            Case 6
                PictureBox1.Image = My.Resources.philippines_flag
            Case 7
                PictureBox1.Image = My.Resources.Uk

            Case 8
                PictureBox1.Image = My.Resources.Japan
            Case 9
                PictureBox1.Image = My.Resources.Europe

        End Select
    End Sub

    Private Sub Selection2_SelectedIndexChanged(sender As Object, e As EventArgs) Handles Selection2.SelectedIndexChanged
        Select Case Selection2.SelectedIndex
            Case 0
                PictureBox2.Image = My.Resources.USA
            Case 1
                PictureBox2.Image = My.Resources.Hongkong
            Case 2
                PictureBox2.Image = My.Resources.Canada
            Case 3
                PictureBox2.Image = My.Resources.India
            Case 4
                PictureBox2.Image = My.Resources.Sri_Lanka
            Case 5
                PictureBox2.Image = My.Resources.UAE
            Case 6
                PictureBox2.Image = My.Resources.philippines_flag
            Case 7
                PictureBox2.Image = My.Resources.Uk
            Case 8
                PictureBox2.Image = My.Resources.Japan
            Case 9
                PictureBox2.Image = My.Resources.Europe

        End Select
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        If String.IsNullOrEmpty(input.Text) OrElse (Selection1.SelectedIndex = -1) OrElse (Selection2.SelectedIndex = -1) Then
            MessageBox.Show("You Don't Have To Clear", "Incomplete Information", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        Else
            Dim result As DialogResult = MessageBox.Show("Are you sure You want to Reset", "Confirmation", MessageBoxButtons.YesNo)
            If result = DialogResult.Yes Then
                Selection1.SelectedIndex = -1
                Selection2.SelectedIndex = -1
                Selection2.Enabled = False
                PictureBox1.Image = My.Resources.preload__2___1_
                PictureBox2.Image = My.Resources.preload__2___1_
                input.Text = Nothing
                ConvertedAmount.Text = Nothing

            End If
        End If
    End Sub
End Class
