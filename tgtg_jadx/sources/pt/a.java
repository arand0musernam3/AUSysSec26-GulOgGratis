package pt;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import mr.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bs.c f35619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f35620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f35621c = new Handler(Looper.getMainLooper());

    public a(bs.c cVar) {
        this.f35619a = cVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        h hVar = new h(5, this, editable);
        this.f35620b = hVar;
        this.f35621c.postDelayed(hVar, 700);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        charSequence.getClass();
        h hVar = this.f35620b;
        if (hVar != null) {
            this.f35621c.removeCallbacks(hVar);
        }
    }
}
