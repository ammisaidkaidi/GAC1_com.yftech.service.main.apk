package com.yftech.service.main.testui;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.yftech.car.screen.CarScreenManager;
import com.yftech.service.main.R;

/* JADX INFO: loaded from: classes.dex */
public class c extends Fragment implements View.OnClickListener, RadioGroup.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private View a;
    private SeekBar b;
    private TextView c;
    private RadioGroup d;
    private RadioGroup e;
    private Button f;
    private EditText g;
    private SeekBar h;
    private TextView i;
    private CarScreenManager j;
    private boolean k = false;
    private int l = -1;
    private CarScreenManager.CarScreenCallback m = new CarScreenManager.CarScreenCallback() { // from class: com.yftech.service.main.testui.c.1
        public void onChangedDayNightMode(int i) {
            c.this.b(i);
        }

        public void onChangedScreenBrightness(boolean z, int i) {
            c.this.a(i);
        }
    };

    private void a() {
        this.b = (SeekBar) this.a.findViewById(R.id.sbBrightness);
        this.c = (TextView) this.a.findViewById(R.id.tvBrightness);
        this.d = (RadioGroup) this.a.findViewById(R.id.rgCloseScreen);
        this.e = (RadioGroup) this.a.findViewById(R.id.rgDayNightMode);
        this.f = (Button) this.a.findViewById(R.id.btnSetBrightnessCurveValue);
        this.g = (EditText) this.a.findViewById(R.id.etSetBrightnessCurveValue);
        this.h = (SeekBar) this.a.findViewById(R.id.sbGetBrightnessCurve);
        this.i = (TextView) this.a.findViewById(R.id.tvGetBrightnessCurve);
        this.b.setMax(this.j.getBrightnessMaxValue());
        this.h.setMax(this.j.getBrightnessMaxValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.b.setProgress(i);
        this.c.setText(String.valueOf(i));
    }

    private void b() {
        this.b.setOnSeekBarChangeListener(this);
        this.d.setOnCheckedChangeListener(this);
        this.e.setOnCheckedChangeListener(this);
        this.f.setOnClickListener(this);
        this.h.setOnSeekBarChangeListener(this);
        this.a.findViewById(R.id.llRoot).setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        this.k = true;
        switch (i) {
            case 0:
                this.e.check(R.id.rbDayMode);
                break;
            case 1:
                this.e.check(R.id.rbNightMode);
                break;
            case 2:
                this.e.check(R.id.rbAutoMode);
                break;
        }
        this.k = false;
    }

    private void c() {
        a(this.j.getBrightness());
        b(this.j.getDayNightMode());
        d();
    }

    private void d() {
        int brightness = this.j.getBrightness();
        int i = (brightness >> 24) & 255;
        this.l = i;
        this.h.setProgress(i);
        this.i.setText("[" + i + ", " + (brightness & 16777215) + "]");
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (this.k) {
        }
        switch (radioGroup.getId()) {
            case R.id.rgCloseScreen /* 2130968652 */:
                switch (i) {
                    case R.id.rbForceCloseScreen /* 2130968645 */:
                        this.j.closeScreenBrightness(-1);
                        break;
                    case R.id.rbForceOpenScreen /* 2130968646 */:
                        this.j.openScreenBrightness(-1);
                        break;
                    case R.id.rbForeverCloseScreen /* 2130968647 */:
                        this.j.closeScreenBrightness(1);
                        break;
                    case R.id.rbForeverOpenScreen /* 2130968648 */:
                        this.j.openScreenBrightness(1);
                        break;
                    case R.id.rbTempCloseScreen /* 2130968650 */:
                        this.j.closeScreenBrightness(0);
                        break;
                    case R.id.rbTempOpenScreen /* 2130968651 */:
                        this.j.openScreenBrightness(0);
                        break;
                }
                break;
            case R.id.rgDayNightMode /* 2130968653 */:
                if (i == R.id.rbNightMode) {
                    this.j.setDayNightMode(1);
                    break;
                } else {
                    switch (i) {
                        case R.id.rbAutoMode /* 2130968625 */:
                            this.j.setDayNightMode(2);
                            break;
                        case R.id.rbDayMode /* 2130968626 */:
                            this.j.setDayNightMode(0);
                            break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.btnSetBrightnessCurveValue) {
            if (id != R.id.llRoot) {
                return;
            }
            this.g.clearFocus();
            ((InputMethodManager) getContext().getApplicationContext().getSystemService("input_method")).hideSoftInputFromWindow(this.g.getWindowToken(), 0);
            return;
        }
        try {
            if (this.j.setBrightness(Integer.parseInt(this.g.getText().toString()) | (this.l << 24))) {
                d();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.j = CarScreenManager.getInstance();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = layoutInflater.inflate(R.layout.screen_fragment, viewGroup, false);
        a();
        b();
        return this.a;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            int id = seekBar.getId();
            if (id == R.id.sbBrightness) {
                this.j.setBrightness(i);
            } else {
                if (id != R.id.sbGetBrightnessCurve) {
                    return;
                }
                if (this.j.setBrightness((-16777216) | i)) {
                    d();
                }
            }
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c();
        this.j.registerCarScreenCallback(this.m, (Handler) null);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.j.unregisterCarScreenCallback(this.m);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
