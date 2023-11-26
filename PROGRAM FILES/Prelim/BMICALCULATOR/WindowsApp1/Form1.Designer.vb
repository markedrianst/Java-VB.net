<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.Height = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.Weight = New System.Windows.Forms.TextBox()
        Me.BMIC = New System.Windows.Forms.TextBox()
        Me.BMI = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'Height
        '
        Me.Height.BackColor = System.Drawing.Color.Silver
        Me.Height.Font = New System.Drawing.Font("Microsoft Sans Serif", 24.0!)
        Me.Height.ForeColor = System.Drawing.Color.White
        Me.Height.Location = New System.Drawing.Point(207, 222)
        Me.Height.Name = "Height"
        Me.Height.Size = New System.Drawing.Size(366, 44)
        Me.Height.TabIndex = 0
        Me.Height.TabStop = False
        Me.Height.Text = "CM"
        Me.Height.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 24.25!)
        Me.Label1.Location = New System.Drawing.Point(12, 170)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(157, 38)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "WEIGHT:"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 24.25!)
        Me.Label2.Location = New System.Drawing.Point(12, 222)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(150, 38)
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "HEIGHT:"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 24.25!)
        Me.Label3.Location = New System.Drawing.Point(12, 277)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(83, 38)
        Me.Label3.TabIndex = 3
        Me.Label3.Text = "BMI:"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Font = New System.Drawing.Font("Microsoft Sans Serif", 16.25!)
        Me.Label4.Location = New System.Drawing.Point(14, 336)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(187, 26)
        Me.Label4.TabIndex = 4
        Me.Label4.Text = "BMI CATEGORY:"
        '
        'Button1
        '
        Me.Button1.BackColor = System.Drawing.Color.Red
        Me.Button1.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!)
        Me.Button1.Location = New System.Drawing.Point(19, 517)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(182, 51)
        Me.Button1.TabIndex = 8
        Me.Button1.Text = "CLEAR"
        Me.Button1.UseVisualStyleBackColor = False
        '
        'Button2
        '
        Me.Button2.BackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(64, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.Button2.FlatAppearance.BorderColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.Button2.FlatAppearance.BorderSize = 3
        Me.Button2.FlatAppearance.MouseDownBackColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.Button2.FlatAppearance.MouseOverBackColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.Button2.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!)
        Me.Button2.Location = New System.Drawing.Point(415, 517)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(182, 51)
        Me.Button2.TabIndex = 9
        Me.Button2.Text = "COMPUTE"
        Me.Button2.UseVisualStyleBackColor = False
        '
        'Weight
        '
        Me.Weight.BackColor = System.Drawing.Color.Silver
        Me.Weight.Font = New System.Drawing.Font("Microsoft Sans Serif", 24.0!)
        Me.Weight.ForeColor = System.Drawing.Color.White
        Me.Weight.Location = New System.Drawing.Point(207, 170)
        Me.Weight.Name = "Weight"
        Me.Weight.Size = New System.Drawing.Size(366, 44)
        Me.Weight.TabIndex = 10
        Me.Weight.TabStop = False
        Me.Weight.Text = "KG"
        Me.Weight.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'BMIC
        '
        Me.BMIC.BackColor = System.Drawing.Color.Silver
        Me.BMIC.Enabled = False
        Me.BMIC.Font = New System.Drawing.Font("Microsoft Sans Serif", 22.0!)
        Me.BMIC.ForeColor = System.Drawing.Color.White
        Me.BMIC.Location = New System.Drawing.Point(207, 336)
        Me.BMIC.Name = "BMIC"
        Me.BMIC.Size = New System.Drawing.Size(366, 41)
        Me.BMIC.TabIndex = 11
        Me.BMIC.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'BMI
        '
        Me.BMI.BackColor = System.Drawing.Color.Silver
        Me.BMI.Enabled = False
        Me.BMI.Font = New System.Drawing.Font("Microsoft Sans Serif", 24.0!)
        Me.BMI.ForeColor = System.Drawing.Color.White
        Me.BMI.Location = New System.Drawing.Point(207, 277)
        Me.BMI.Name = "BMI"
        Me.BMI.Size = New System.Drawing.Size(366, 44)
        Me.BMI.TabIndex = 12
        Me.BMI.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Font = New System.Drawing.Font("Microsoft Sans Serif", 62.0!, System.Drawing.FontStyle.Bold)
        Me.Label5.Location = New System.Drawing.Point(12, 39)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(600, 95)
        Me.Label5.TabIndex = 13
        Me.Label5.Text = "BMI Calculator"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.AutoSize = True
        Me.BackColor = System.Drawing.Color.Maroon
        Me.ClientSize = New System.Drawing.Size(609, 596)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.BMI)
        Me.Controls.Add(Me.BMIC)
        Me.Controls.Add(Me.Weight)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Height)
        Me.Name = "Form1"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "BMI CALCULATOR"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Height As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Button1 As Button
    Friend WithEvents Button2 As Button
    Friend WithEvents Weight As TextBox
    Friend WithEvents BMIC As TextBox
    Friend WithEvents BMI As TextBox
    Friend WithEvents Label5 As Label
End Class
