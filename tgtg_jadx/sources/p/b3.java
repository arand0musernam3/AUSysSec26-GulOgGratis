package p;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.a f33854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.h f33855b;

    public b3(androidx.appcompat.widget.h hVar) {
        this.f33855b = hVar;
        Context context = hVar.f2157a.getContext();
        CharSequence charSequence = hVar.f2164h;
        o.a aVar = new o.a();
        aVar.f31460e = 4096;
        aVar.f31462g = 4096;
        aVar.l = null;
        aVar.f31467m = null;
        aVar.f31468n = false;
        aVar.f31469o = false;
        aVar.f31470p = 16;
        aVar.f31464i = context;
        aVar.f31456a = charSequence;
        this.f33854a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        androidx.appcompat.widget.h hVar = this.f33855b;
        Window.Callback callback = hVar.f2167k;
        if (callback == null || !hVar.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f33854a);
    }
}
