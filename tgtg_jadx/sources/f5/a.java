package f5;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import d4.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f17326b;

    public a(ContentCaptureSession contentCaptureSession, View view) {
        this.f17325a = contentCaptureSession;
        this.f17326b = view;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            e40.a.e(this.f17325a).notifyViewsDisappeared(this.f17326b.getAutofillId(), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j9) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e40.a.e(this.f17325a).newAutofillId(this.f17326b.getAutofillId(), j9);
        }
        return null;
    }

    public final se.b c(AutofillId autofillId, long j9) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new se.b(e40.a.e(this.f17325a).newVirtualViewStructure(autofillId, j9), 19);
        }
        return null;
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            e40.a.e(this.f17325a).notifyViewAppeared(viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            e40.a.e(this.f17325a).notifyViewDisappeared(autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.f17325a).notifyViewTextChanged(autofillId, str);
        }
    }
}
