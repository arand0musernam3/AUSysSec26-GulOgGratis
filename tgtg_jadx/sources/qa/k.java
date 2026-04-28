package qa;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f36688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f36690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f36691e;

    public k(m mVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f36691e = mVar;
        this.f36687a = obj;
        this.f36688b = arrayList;
        this.f36689c = obj2;
        this.f36690d = arrayList2;
    }

    @Override // qa.z, qa.w
    public final void a(y yVar) {
        m mVar = this.f36691e;
        Object obj = this.f36687a;
        if (obj != null) {
            mVar.z(obj, this.f36688b, null);
        }
        Object obj2 = this.f36689c;
        if (obj2 != null) {
            mVar.z(obj2, this.f36690d, null);
        }
    }

    @Override // qa.z, qa.w
    public final void c(y yVar) {
        yVar.F(this);
    }
}
