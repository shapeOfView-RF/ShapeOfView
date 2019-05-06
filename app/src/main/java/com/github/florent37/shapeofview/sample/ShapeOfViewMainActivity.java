package com.github.florent37.shapeofview.sample;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.github.florent37.shapeofview.shapes.DiagonalView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;

public class ShapeOfViewMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shape_of_view_activity_main);
        ButterKnife.bind(this);

        EditText inputHeight = findViewById(R.id.input_height);
        DiagonalView diagonalLayout = findViewById(R.id.diagonalLayout);

        inputHeight.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(final CharSequence s, final int start, final int count, final int after) {
                        //nothing to do
                    }

                    @Override
                    public void onTextChanged(final CharSequence s, final int start, final int before, final int count) {
                        //nothing to do
                    }

                    @Override
                    public void afterTextChanged(final Editable editable) {
                        if (editable.toString().isEmpty())
                        {
                            return;
                        }
                        int heightValue = Integer.valueOf(editable.toString());
                        if (heightValue > 0) {
                            diagonalLayout.setPerpendicularHeight(heightValue);
                        }
                    }
                }
        );
    }
}
