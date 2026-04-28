package z4;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f47216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f47217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f47218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f47219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Serializable f47220f;

    /* JADX WARN: Multi-variable type inference failed */
    public r(r[] rVarArr) {
        this.f47215a = 0;
        this.f47220f = rVarArr;
        int length = rVarArr.length;
        q[] qVarArr = new q[length];
        for (int i11 = 0; i11 < length; i11++) {
            qVarArr[i11] = ((r[]) this.f47220f)[i11].b();
        }
        this.f47216b = new q(1, new c2(qVarArr, 0));
        int length2 = ((r[]) this.f47220f).length;
        q[] qVarArr2 = new q[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            qVarArr2[i12] = ((r[]) this.f47220f)[i12].d();
        }
        this.f47217c = new q(0, new p(qVarArr2, 0));
        int length3 = ((r[]) this.f47220f).length;
        q[] qVarArr3 = new q[length3];
        for (int i13 = 0; i13 < length3; i13++) {
            qVarArr3[i13] = ((r[]) this.f47220f)[i13].c();
        }
        this.f47218d = new q(1, new c2(qVarArr3, 1));
        int length4 = ((r[]) this.f47220f).length;
        q[] qVarArr4 = new q[length4];
        for (int i14 = 0; i14 < length4; i14++) {
            qVarArr4[i14] = ((r[]) this.f47220f)[i14].a();
        }
        this.f47219e = new q(0, new p(qVarArr4, 1));
    }

    public final q a() {
        switch (this.f47215a) {
        }
        return this.f47219e;
    }

    public final q b() {
        switch (this.f47215a) {
        }
        return this.f47216b;
    }

    public final q c() {
        switch (this.f47215a) {
        }
        return this.f47218d;
    }

    public final q d() {
        switch (this.f47215a) {
        }
        return this.f47217c;
    }

    public final String toString() {
        switch (this.f47215a) {
            case 0:
                return kotlin.collections.y.H((r[]) this.f47220f, null, "innermostOf(", ")", null, 57);
            default:
                return e0.f.g(')', "RectRulers(", (String) this.f47220f);
        }
    }

    public r(String str) {
        this.f47215a = 1;
        this.f47220f = str;
        this.f47216b = new q(1, null);
        this.f47217c = new q(0, null);
        this.f47218d = new q(1, null);
        this.f47219e = new q(0, null);
    }
}
