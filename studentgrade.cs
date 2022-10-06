double English, Math, Science, Filipino, History, GenAve;
            string passfail;

            English = int.Parse(txtEng.Text);
            Math = int.Parse(txtMath.Text);
            Science = int.Parse(txtSci.Text);
            Filipino = int.Parse(txtFil.Text);
            History = int.Parse(txtHis.Text);

            GenAve = English + Math + Science + Filipino + History;

            lblGenAve.Text = GenAve.ToString();

            GenAve = GenAve / 5;

            lblGenAve.Text = GenAve.ToString();

            if(GenAve>=75)
            {
                passfail = "Passed";
            }
            else
            {
                passfail = "Failed";
            }
            lblpassfail.Text = passfail;
