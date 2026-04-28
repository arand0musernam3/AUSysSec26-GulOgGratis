package com.app.tgtg.feature.locationpicker;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.app.tgtg.R;
import f70.i;
import o30.f0;
import qs.a;
import uk.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class LocationPickerActivity extends a {
    public LocationPickerActivity() {
        super(3);
    }

    @Override // qs.a, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        super.onCreate(bundle);
        setContentView(R.layout.location_picker_activity_new);
        f0.S(this, true);
        Intent intent = getIntent();
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("ORIGIN", i.class);
        } else {
            Object serializableExtra2 = intent.getSerializableExtra("ORIGIN");
            if (!(serializableExtra2 instanceof i)) {
                serializableExtra2 = null;
            }
            serializableExtra = (i) serializableExtra2;
        }
        i iVar = (i) serializableExtra;
        if (iVar == null) {
            iVar = i.UNKNOWN;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        c cVar = new c();
        Bundle arguments = cVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putSerializable("ORIGIN", iVar);
        cVar.setArguments(arguments);
        aVar.f(R.id.frame_layout, cVar, null);
        aVar.d();
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }
}
