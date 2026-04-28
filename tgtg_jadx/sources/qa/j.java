package qa;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f36685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f36686b;

    public j(View view, ArrayList arrayList) {
        this.f36685a = view;
        this.f36686b = arrayList;
    }

    @Override // qa.w
    public final void a(y yVar) {
        yVar.F(this);
        yVar.a(this);
    }

    @Override // qa.w
    public final void c(y yVar) {
        yVar.F(this);
        this.f36685a.setVisibility(8);
        ArrayList arrayList = this.f36686b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((View) arrayList.get(i11)).setVisibility(0);
        }
    }

    @Override // qa.w
    public final void b() {
    }

    @Override // qa.w
    public final void f() {
    }

    @Override // qa.w
    public final void g(y yVar) {
    }
}
