package com.yftech.service.main.testui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yftech.service.main.R;

/* JADX INFO: loaded from: classes.dex */
public class b extends Fragment implements View.OnClickListener {
    private View a;

    private void a() {
        this.a.findViewById(R.id.btnAudioVolume).setOnClickListener(this);
        this.a.findViewById(R.id.btnSoundEffect).setOnClickListener(this);
        this.a.findViewById(R.id.btnScreen).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        int id = view.getId();
        if (id == R.id.btnAudioVolume) {
            i = 1;
        } else if (id != R.id.btnScreen) {
            i = id != R.id.btnSoundEffect ? -1 : 2;
        } else {
            i = 3;
        }
        if (i != -1) {
            ((MainActivity) getActivity()).a(i);
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a = layoutInflater.inflate(R.layout.main_fragment, viewGroup, false);
        return this.a;
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        a();
    }
}
