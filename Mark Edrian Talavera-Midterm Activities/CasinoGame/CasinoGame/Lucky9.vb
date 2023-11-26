Imports System.IO
Imports System.Security.Cryptography.X509Certificates
Imports System.Text
Imports System.Windows.Forms.VisualStyles.VisualStyleElement
Imports System.Windows.Forms.VisualStyles.VisualStyleElement.Rebar

Public Class Lucky9
    Dim rand1, rand As New Random()
    Dim ran1 As Integer
    Dim bankerCardDrawn As Boolean = False
    Dim bankerStands As Boolean = False ' Flag to track whether the banker stands
    Dim userCardDrawn As Boolean = False ' Track whether a user card has been drawn
    Dim total1 As Integer
    Dim ucd1, ucd2, ucd3, ucd4, ucd5 As Integer
    Public balance, total2, total3, total4, total5, total6, total7 As Integer
    Public ut, bt
    Private Sub Lucky9_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        ran1 = rand1.Next(0, 5)
        PictureBox7.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Avatars\Avatar" & ran1 & ".png")
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
    Private Sub GetCards_Click(sender As Object, e As EventArgs) Handles GetCards.Click

        If String.IsNullOrEmpty(TextBox2.Text) OrElse TextBox2.Text = 0 Then
            MsgBox("Bet First!")
        ElseIf balance = 0 OrElse String.IsNullOrWhiteSpace(Betamount.Text) Then
            MsgBox("You don't have enough money to play")
        ElseIf balance < TextBox2.Text Then
            MsgBox("Your bet is bigger than your money")
        ElseIf TextBox2.Text.Contains(".") Then
            MsgBox("Whole numbers only")
        Else
            GetCards.Enabled = False
            UserCardPicbox1.Visible = True
            UserCardPicbox2.Visible = True
            UserCartaPicbox.Visible = True
            PictureBox1.Visible = True
            PictureBox2.Visible = True
            ShowCard.Enabled = True
            Carta.Enabled = True
            total1 = DrawRandomCard1()
            ucd1 = total1
            UserCardPicbox1.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Cards\Card" & total1 & ".png")
            If total1 = 0 OrElse total1 = 10 OrElse total1 = 20 OrElse total1 = 30 Then
                total2 = 1
            ElseIf total1 = 1 OrElse total1 = 11 OrElse total1 = 21 OrElse total1 = 31 Then
                total2 = 2
            ElseIf total1 = 2 OrElse total1 = 12 OrElse total1 = 22 OrElse total1 = 32 Then
                total2 = 3
            ElseIf total1 = 3 OrElse total1 = 13 OrElse total1 = 23 OrElse total1 = 33 Then
                total2 = 4
            ElseIf total1 = 4 OrElse total1 = 14 OrElse total1 = 24 OrElse total1 = 34 Then
                total2 = 5
            ElseIf total1 = 5 OrElse total1 = 15 OrElse total1 = 25 OrElse total1 = 35 Then
                total2 = 6
            ElseIf total1 = 6 OrElse total1 = 16 OrElse total1 = 26 OrElse total1 = 36 Then
                total2 = 7
            ElseIf total1 = 7 OrElse total1 = 17 OrElse total1 = 27 OrElse total1 = 37 Then
                total2 = 8
            ElseIf total1 = 8 OrElse total1 = 18 OrElse total1 = 28 OrElse total1 = 38 Then
                total2 = 9
            ElseIf total1 = 9 OrElse total1 = 19 OrElse total1 = 29 OrElse total1 = 39 Then
                total2 = 10
            End If

            total1 = DrawRandomCard1()
            ucd2 = total1
            If ucd1 = ucd2 Then
                total1 = DrawRandomCard1()
                UserCardPicbox2.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Cards\Card" & total1 & ".png")
                If total1 = 0 OrElse total1 = 10 OrElse total1 = 20 OrElse total1 = 30 Then
                    total3 = 1
                ElseIf total1 = 1 OrElse total1 = 11 OrElse total1 = 21 OrElse total1 = 31 Then
                    total3 = 2
                ElseIf total1 = 2 OrElse total1 = 12 OrElse total1 = 22 OrElse total1 = 32 Then
                    total3 = 3
                ElseIf total1 = 3 OrElse total1 = 13 OrElse total1 = 23 OrElse total1 = 33 Then
                    total3 = 4
                ElseIf total1 = 4 OrElse total1 = 14 OrElse total1 = 24 OrElse total1 = 34 Then
                    total3 = 5
                ElseIf total1 = 5 OrElse total1 = 15 OrElse total1 = 25 OrElse total1 = 35 Then
                    total3 = 6
                ElseIf total1 = 6 OrElse total1 = 16 OrElse total1 = 26 OrElse total1 = 36 Then
                    total3 = 7
                ElseIf total1 = 7 OrElse total1 = 17 OrElse total1 = 27 OrElse total1 = 37 Then
                    total3 = 8
                ElseIf total1 = 8 OrElse total1 = 18 OrElse total1 = 28 OrElse total1 = 38 Then
                    total3 = 9
                ElseIf total1 = 9 OrElse total1 = 19 OrElse total1 = 29 OrElse total1 = 39 Then
                    total3 = 10
                End If
            Else
                UserCardPicbox2.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Cards\Card" & total1 & ".png")
                If total1 = 0 OrElse total1 = 10 OrElse total1 = 20 OrElse total1 = 30 Then
                    total3 = 1
                ElseIf total1 = 1 OrElse total1 = 11 OrElse total1 = 21 OrElse total1 = 31 Then
                    total3 = 2
                ElseIf total1 = 2 OrElse total1 = 12 OrElse total1 = 22 OrElse total1 = 32 Then
                    total3 = 3
                ElseIf total1 = 3 OrElse total1 = 13 OrElse total1 = 23 OrElse total1 = 33 Then
                    total3 = 4
                ElseIf total1 = 4 OrElse total1 = 14 OrElse total1 = 24 OrElse total1 = 34 Then
                    total3 = 5
                ElseIf total1 = 5 OrElse total1 = 15 OrElse total1 = 25 OrElse total1 = 35 Then
                    total3 = 6
                ElseIf total1 = 6 OrElse total1 = 16 OrElse total1 = 26 OrElse total1 = 36 Then
                    total3 = 7
                ElseIf total1 = 7 OrElse total1 = 17 OrElse total1 = 27 OrElse total1 = 37 Then
                    total3 = 8
                ElseIf total1 = 8 OrElse total1 = 18 OrElse total1 = 28 OrElse total1 = 38 Then
                    total3 = 9
                ElseIf total1 = 9 OrElse total1 = 19 OrElse total1 = 29 OrElse total1 = 39 Then
                    total3 = 10
                End If
            End If


            total1 = DrawRandomCard1()
            ucd3 = total1
            If ucd3 = ucd1 OrElse ucd3 = ucd2 Then
                total1 = DrawRandomCard1()
                BankerCardsPicBox1.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Cards\Card" & total1 & ".png")
                If total1 = 0 OrElse total1 = 10 OrElse total1 = 20 OrElse total1 = 30 Then
                    total4 = 1
                ElseIf total1 = 1 OrElse total1 = 11 OrElse total1 = 21 OrElse total1 = 31 Then
                    total4 = 2
                ElseIf total1 = 2 OrElse total1 = 12 OrElse total1 = 22 OrElse total1 = 32 Then
                    total4 = 3
                ElseIf total1 = 3 OrElse total1 = 13 OrElse total1 = 23 OrElse total1 = 33 Then
                    total4 = 4
                ElseIf total1 = 4 OrElse total1 = 14 OrElse total1 = 24 OrElse total1 = 34 Then
                    total4 = 5
                ElseIf total1 = 5 OrElse total1 = 15 OrElse total1 = 25 OrElse total1 = 35 Then
                    total4 = 6
                ElseIf total1 = 6 OrElse total1 = 16 OrElse total1 = 26 OrElse total1 = 36 Then
                    total4 = 7
                ElseIf total1 = 7 OrElse total1 = 17 OrElse total1 = 27 OrElse total1 = 37 Then
                    total4 = 8
                ElseIf total1 = 8 OrElse total1 = 18 OrElse total1 = 28 OrElse total1 = 38 Then
                    total4 = 9
                ElseIf total1 = 9 OrElse total1 = 19 OrElse total1 = 29 OrElse total1 = 39 Then
                    total4 = 10
                End If
            Else
                BankerCardsPicBox1.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Cards\Card" & total1 & ".png")
                If total1 = 0 OrElse total1 = 10 OrElse total1 = 20 OrElse total1 = 30 Then
                    total4 = 1
                ElseIf total1 = 1 OrElse total1 = 11 OrElse total1 = 21 OrElse total1 = 31 Then
                    total4 = 2
                ElseIf total1 = 2 OrElse total1 = 12 OrElse total1 = 22 OrElse total1 = 32 Then
                    total4 = 3
                ElseIf total1 = 3 OrElse total1 = 13 OrElse total1 = 23 OrElse total1 = 33 Then
                    total4 = 4
                ElseIf total1 = 4 OrElse total1 = 14 OrElse total1 = 24 OrElse total1 = 34 Then
                    total4 = 5
                ElseIf total1 = 5 OrElse total1 = 15 OrElse total1 = 25 OrElse total1 = 35 Then
                    total4 = 6
                ElseIf total1 = 6 OrElse total1 = 16 OrElse total1 = 26 OrElse total1 = 36 Then
                    total4 = 7
                ElseIf total1 = 7 OrElse total1 = 17 OrElse total1 = 27 OrElse total1 = 37 Then
                    total4 = 8
                ElseIf total1 = 8 OrElse total1 = 18 OrElse total1 = 28 OrElse total1 = 38 Then
                    total4 = 9
                ElseIf total1 = 9 OrElse total1 = 19 OrElse total1 = 29 OrElse total1 = 39 Then
                    total4 = 10
                End If
            End If

            total1 = DrawRandomCard1()
            ucd4 = total1
            If ucd4 = ucd1 OrElse ucd4 = ucd3 OrElse ucd4 = ucd2 Then
                total1 = DrawRandomCard1()
                BankerCardsPicBox2.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Cards\Card" & total1 & ".png")
                If total1 = 0 OrElse total1 = 10 OrElse total1 = 20 OrElse total1 = 30 Then
                    total5 = 1
                ElseIf total1 = 1 OrElse total1 = 11 OrElse total1 = 21 OrElse total1 = 31 Then
                    total5 = 2
                ElseIf total1 = 2 OrElse total1 = 12 OrElse total1 = 22 OrElse total1 = 32 Then
                    total5 = 3
                ElseIf total1 = 3 OrElse total1 = 13 OrElse total1 = 23 OrElse total1 = 33 Then
                    total5 = 4
                ElseIf total1 = 4 OrElse total1 = 14 OrElse total1 = 24 OrElse total1 = 34 Then
                    total5 = 5
                ElseIf total1 = 5 OrElse total1 = 15 OrElse total1 = 25 OrElse total1 = 35 Then
                    total5 = 6
                ElseIf total1 = 6 OrElse total1 = 16 OrElse total1 = 26 OrElse total1 = 36 Then
                    total5 = 7
                ElseIf total1 = 7 OrElse total1 = 17 OrElse total1 = 27 OrElse total1 = 37 Then
                    total5 = 8
                ElseIf total1 = 8 OrElse total1 = 18 OrElse total1 = 28 OrElse total1 = 38 Then
                    total5 = 9
                ElseIf total1 = 9 OrElse total1 = 19 OrElse total1 = 29 OrElse total1 = 39 Then
                    total5 = 10
                End If
            Else
                BankerCardsPicBox2.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Cards\Card" & total1 & ".png")
                If total1 = 0 OrElse total1 = 10 OrElse total1 = 20 OrElse total1 = 30 Then
                    total5 = 1
                ElseIf total1 = 1 OrElse total1 = 11 OrElse total1 = 21 OrElse total1 = 31 Then
                    total5 = 2
                ElseIf total1 = 2 OrElse total1 = 12 OrElse total1 = 22 OrElse total1 = 32 Then
                    total5 = 3
                ElseIf total1 = 3 OrElse total1 = 13 OrElse total1 = 23 OrElse total1 = 33 Then
                    total5 = 4
                ElseIf total1 = 4 OrElse total1 = 14 OrElse total1 = 24 OrElse total1 = 34 Then
                    total5 = 5
                ElseIf total1 = 5 OrElse total1 = 15 OrElse total1 = 25 OrElse total1 = 35 Then
                    total5 = 6
                ElseIf total1 = 6 OrElse total1 = 16 OrElse total1 = 26 OrElse total1 = 36 Then
                    total5 = 7
                ElseIf total1 = 7 OrElse total1 = 17 OrElse total1 = 27 OrElse total1 = 37 Then
                    total5 = 8
                ElseIf total1 = 8 OrElse total1 = 18 OrElse total1 = 28 OrElse total1 = 38 Then
                    total5 = 9
                ElseIf total1 = 9 OrElse total1 = 19 OrElse total1 = 29 OrElse total1 = 39 Then
                    total5 = 10
                End If
            End If

            Dim tots As Integer
            tots = total5 + total4
            If tots < 6 Then
                Dim isTrue As Boolean = rand.Next(0, 2)
                If isTrue = True Then
                    total1 = DrawRandomCard1()
                    ucd5 = total1
                    If ucd5 = ucd1 OrElse ucd5 = ucd3 OrElse ucd5 = ucd4 OrElse ucd5 = ucd2 Then
                        total1 = DrawRandomCard1()
                        BankerCartaPicBox.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Cards\Card" & total1 & ".png")
                        If total1 = 0 OrElse total1 = 10 OrElse total1 = 20 OrElse total1 = 30 Then
                            total7 = 1
                        ElseIf total1 = 1 OrElse total1 = 11 OrElse total1 = 21 OrElse total1 = 31 Then
                            total7 = 2
                        ElseIf total1 = 2 OrElse total1 = 12 OrElse total1 = 22 OrElse total1 = 32 Then
                            total7 = 3
                        ElseIf total1 = 3 OrElse total1 = 13 OrElse total1 = 23 OrElse total1 = 33 Then
                            total7 = 4
                        ElseIf total1 = 4 OrElse total1 = 14 OrElse total1 = 24 OrElse total1 = 34 Then
                            total7 = 5
                        ElseIf total1 = 5 OrElse total1 = 15 OrElse total1 = 25 OrElse total1 = 35 Then
                            total7 = 6
                        ElseIf total1 = 6 OrElse total1 = 16 OrElse total1 = 26 OrElse total1 = 36 Then
                            total7 = 7
                        ElseIf total1 = 7 OrElse total1 = 17 OrElse total1 = 27 OrElse total1 = 37 Then
                            total7 = 8
                        ElseIf total1 = 8 OrElse total1 = 18 OrElse total1 = 28 OrElse total1 = 38 Then
                            total7 = 9
                        ElseIf total1 = 9 OrElse total1 = 19 OrElse total1 = 29 OrElse total1 = 39 Then
                            total7 = 10
                        Else
                            total7 = 0
                        End If
                        PictureBox3.Visible = True
                    Else
                        BankerCartaPicBox.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Cards\Card" & total1 & ".png")
                        If total1 = 0 OrElse total1 = 10 OrElse total1 = 20 OrElse total1 = 30 Then
                            total7 = 1
                        ElseIf total1 = 1 OrElse total1 = 11 OrElse total1 = 21 OrElse total1 = 31 Then
                            total7 = 2
                        ElseIf total1 = 2 OrElse total1 = 12 OrElse total1 = 22 OrElse total1 = 32 Then
                            total7 = 3
                        ElseIf total1 = 3 OrElse total1 = 13 OrElse total1 = 23 OrElse total1 = 33 Then
                            total7 = 4
                        ElseIf total1 = 4 OrElse total1 = 14 OrElse total1 = 24 OrElse total1 = 34 Then
                            total7 = 5
                        ElseIf total1 = 5 OrElse total1 = 15 OrElse total1 = 25 OrElse total1 = 35 Then
                            total7 = 6
                        ElseIf total1 = 6 OrElse total1 = 16 OrElse total1 = 26 OrElse total1 = 36 Then
                            total7 = 7
                        ElseIf total1 = 7 OrElse total1 = 17 OrElse total1 = 27 OrElse total1 = 37 Then
                            total7 = 8
                        ElseIf total1 = 8 OrElse total1 = 18 OrElse total1 = 28 OrElse total1 = 38 Then
                            total7 = 9
                        ElseIf total1 = 9 OrElse total1 = 19 OrElse total1 = 29 OrElse total1 = 39 Then
                            total7 = 10
                        Else
                            total7 = 0
                        End If
                        PictureBox3.Visible = True
                    End If
                End If
            End If
        End If
    End Sub
    Private Sub ShowCard_Click(sender As Object, e As EventArgs) Handles ShowCard.Click
        BankerCardsPicBox1.Visible = True
        BankerCardsPicBox2.Visible = True
        BankerCartaPicBox.Visible = True
        PictureBox1.Visible = False
        PictureBox2.Visible = False
        PictureBox3.Visible = False
        Dim betamount1 As Integer
        If Integer.TryParse(TextBox2.Text, betamount1) Then
            Dim userTotal As Double
            userTotal = (total2 + total3 + total6) Mod 10
            Dim BankerTotal As Integer
            BankerTotal = (total4 + total5 + total7) Mod 10
            ut = userTotal
            bt = BankerTotal
            Label6.Text = bt
            Label7.Text = ut
            Dim total As Double
            If ut = bt Then
                MsgBox("It's a tie")
                total = balance
                total2 = Nothing
                total3 = Nothing
                total4 = Nothing
                total5 = Nothing
                total6 = Nothing
                total7 = Nothing
                GetCards.Enabled = True
                UserCardPicbox1.Image = Nothing
                UserCardPicbox2.Image = Nothing
                UserCartaPicbox.Image = Nothing
                UserCardPicbox1.Visible = False
                UserCardPicbox2.Visible = False
                UserCartaPicbox.Visible = False
                BankerCardsPicBox1.Visible = False
                BankerCardsPicBox2.Visible = False
                BankerCartaPicBox.Visible = False
                BankerCardsPicBox1.Image = Nothing
                BankerCardsPicBox2.Image = Nothing
                BankerCartaPicBox.Image = Nothing
                Label6.Text = 0
                Label7.Text = 0
                ShowCard.Enabled = False
                Carta.Enabled = False
                balance = total
                Betamount.Text = balance
            ElseIf ut > bt Then
                MsgBox("User wins")
                total = betamount1 + balance
                GetCards.Enabled = True
                total2 = Nothing
                total3 = Nothing
                total4 = Nothing
                total5 = Nothing
                total6 = Nothing
                total7 = Nothing
                UserCardPicbox1.Image = Nothing
                UserCardPicbox2.Image = Nothing
                UserCartaPicbox.Image = Nothing
                UserCardPicbox1.Visible = False
                UserCardPicbox2.Visible = False
                UserCartaPicbox.Visible = False
                BankerCardsPicBox1.Visible = False
                BankerCardsPicBox2.Visible = False
                BankerCartaPicBox.Visible = False
                BankerCardsPicBox1.Image = Nothing
                BankerCardsPicBox2.Image = Nothing
                BankerCartaPicBox.Image = Nothing
                ShowCard.Enabled = False
                Carta.Enabled = False
                Label6.Text = 0
                Label7.Text = 0
                balance = total
                Betamount.Text = balance
            ElseIf bt > ut Then
                MsgBox("Banker wins")
                total = balance - betamount1
                GetCards.Enabled = True
                total2 = Nothing
                total3 = Nothing
                total4 = Nothing
                total5 = Nothing
                total6 = Nothing
                total7 = Nothing
                UserCardPicbox1.Image = Nothing
                UserCardPicbox2.Image = Nothing
                UserCartaPicbox.Image = Nothing
                UserCardPicbox1.Visible = False
                UserCardPicbox2.Visible = False
                UserCartaPicbox.Visible = False
                BankerCardsPicBox1.Visible = False
                BankerCardsPicBox2.Visible = False
                BankerCartaPicBox.Visible = False
                BankerCardsPicBox1.Image = Nothing
                BankerCardsPicBox2.Image = Nothing
                BankerCartaPicBox.Image = Nothing
                ShowCard.Enabled = False
                Carta.Enabled = False
                Label6.Text = 0
                Label7.Text = 0
                balance = total
                Betamount.Text = balance
            End If
        End If
    End Sub
    Private Sub Carta_Click(sender As Object, e As EventArgs) Handles Carta.Click
        total1 = DrawRandomCard1()
        Dim ucd6 As Integer = total1
        If ucd6 = ucd1 OrElse ucd6 = ucd3 OrElse ucd6 = ucd4 OrElse ucd6 = ucd5 OrElse ucd6 = ucd2 Then
            total1 = DrawRandomCard1()
            UserCartaPicbox.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Cards\Card" & total1 & ".png")
            If total1 = 0 OrElse total1 = 10 OrElse total1 = 20 OrElse total1 = 30 Then
                total6 = 1
            ElseIf total1 = 1 OrElse total1 = 11 OrElse total1 = 21 OrElse total1 = 31 Then
                total6 = 2
            ElseIf total1 = 2 OrElse total1 = 12 OrElse total1 = 22 OrElse total1 = 32 Then
                total6 = 3
            ElseIf total1 = 3 OrElse total1 = 13 OrElse total1 = 23 OrElse total1 = 33 Then
                total6 = 4
            ElseIf total1 = 4 OrElse total1 = 14 OrElse total1 = 24 OrElse total1 = 34 Then
                total6 = 5
            ElseIf total1 = 5 OrElse total1 = 15 OrElse total1 = 25 OrElse total1 = 35 Then
                total6 = 6
            ElseIf total1 = 6 OrElse total1 = 16 OrElse total1 = 26 OrElse total1 = 36 Then
                total6 = 7
            ElseIf total1 = 7 OrElse total1 = 17 OrElse total1 = 27 OrElse total1 = 37 Then
                total6 = 8
            ElseIf total1 = 8 OrElse total1 = 18 OrElse total1 = 28 OrElse total1 = 38 Then
                total6 = 9
            ElseIf total1 = 9 OrElse total1 = 19 OrElse total1 = 29 OrElse total1 = 39 Then
                total6 = 10
            End If
        Else
            UserCartaPicbox.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Cards\Card" & total1 & ".png")
            If total1 = 0 OrElse total1 = 10 OrElse total1 = 20 OrElse total1 = 30 Then
                total6 = 1
            ElseIf total1 = 1 OrElse total1 = 11 OrElse total1 = 21 OrElse total1 = 31 Then
                total6 = 2
            ElseIf total1 = 2 OrElse total1 = 12 OrElse total1 = 22 OrElse total1 = 32 Then
                total6 = 3
            ElseIf total1 = 3 OrElse total1 = 13 OrElse total1 = 23 OrElse total1 = 33 Then
                total6 = 4
            ElseIf total1 = 4 OrElse total1 = 14 OrElse total1 = 24 OrElse total1 = 34 Then
                total6 = 5
            ElseIf total1 = 5 OrElse total1 = 15 OrElse total1 = 25 OrElse total1 = 35 Then
                total6 = 6
            ElseIf total1 = 6 OrElse total1 = 16 OrElse total1 = 26 OrElse total1 = 36 Then
                total6 = 7
            ElseIf total1 = 7 OrElse total1 = 17 OrElse total1 = 27 OrElse total1 = 37 Then
                total6 = 8
            ElseIf total1 = 8 OrElse total1 = 18 OrElse total1 = 28 OrElse total1 = 38 Then
                total6 = 9
            ElseIf total1 = 9 OrElse total1 = 19 OrElse total1 = 29 OrElse total1 = 39 Then
                total6 = 10
            End If
            userCardDrawn = True
            Carta.Enabled = False
        End If
    End Sub
    Public Function DrawRandomCard1() As Integer
        ran1 = rand.Next(0, 40)
        Return ran1
    End Function
End Class
