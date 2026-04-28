package androidx.vectordrawable.graphics.drawable;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.braze.h2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f4063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f4067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f4068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f4069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f4072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f4073k;

    public l(l lVar, q1.e eVar) {
        n jVar;
        this.f4063a = new Matrix();
        this.f4064b = new ArrayList();
        this.f4065c = 0.0f;
        this.f4066d = 0.0f;
        this.f4067e = 0.0f;
        this.f4068f = 1.0f;
        this.f4069g = 1.0f;
        this.f4070h = 0.0f;
        this.f4071i = 0.0f;
        Matrix matrix = new Matrix();
        this.f4072j = matrix;
        this.f4073k = null;
        this.f4065c = lVar.f4065c;
        this.f4066d = lVar.f4066d;
        this.f4067e = lVar.f4067e;
        this.f4068f = lVar.f4068f;
        this.f4069g = lVar.f4069g;
        this.f4070h = lVar.f4070h;
        this.f4071i = lVar.f4071i;
        String str = lVar.f4073k;
        this.f4073k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(lVar.f4072j);
        ArrayList arrayList = lVar.f4064b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Object obj = arrayList.get(i11);
            if (obj instanceof l) {
                this.f4064b.add(new l((l) obj, eVar));
            } else {
                if (obj instanceof k) {
                    k kVar = (k) obj;
                    k kVar2 = new k(kVar);
                    kVar2.f4054e = 0.0f;
                    kVar2.f4056g = 1.0f;
                    kVar2.f4057h = 1.0f;
                    kVar2.f4058i = 0.0f;
                    kVar2.f4059j = 1.0f;
                    kVar2.f4060k = 0.0f;
                    kVar2.l = Paint.Cap.BUTT;
                    kVar2.f4061m = Paint.Join.MITER;
                    kVar2.f4062n = 4.0f;
                    kVar2.f4053d = kVar.f4053d;
                    kVar2.f4054e = kVar.f4054e;
                    kVar2.f4056g = kVar.f4056g;
                    kVar2.f4055f = kVar.f4055f;
                    kVar2.f4076c = kVar.f4076c;
                    kVar2.f4057h = kVar.f4057h;
                    kVar2.f4058i = kVar.f4058i;
                    kVar2.f4059j = kVar.f4059j;
                    kVar2.f4060k = kVar.f4060k;
                    kVar2.l = kVar.l;
                    kVar2.f4061m = kVar.f4061m;
                    kVar2.f4062n = kVar.f4062n;
                    jVar = kVar2;
                } else {
                    if (!(obj instanceof j)) {
                        h2.b("Unknown object in the tree!");
                        throw null;
                    }
                    jVar = new j((j) obj);
                }
                this.f4064b.add(jVar);
                Object obj2 = jVar.f4075b;
                if (obj2 != null) {
                    eVar.put(obj2, jVar);
                }
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.m
    public final boolean a() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f4064b;
            if (i11 >= arrayList.size()) {
                return false;
            }
            if (((m) arrayList.get(i11)).a()) {
                return true;
            }
            i11++;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.m
    public final boolean b(int[] iArr) {
        int i11 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f4064b;
            if (i11 >= arrayList.size()) {
                return zB;
            }
            zB |= ((m) arrayList.get(i11)).b(iArr);
            i11++;
        }
    }

    public final void c() {
        Matrix matrix = this.f4072j;
        matrix.reset();
        matrix.postTranslate(-this.f4066d, -this.f4067e);
        matrix.postScale(this.f4068f, this.f4069g);
        matrix.postRotate(this.f4065c, 0.0f, 0.0f);
        matrix.postTranslate(this.f4070h + this.f4066d, this.f4071i + this.f4067e);
    }

    public String getGroupName() {
        return this.f4073k;
    }

    public Matrix getLocalMatrix() {
        return this.f4072j;
    }

    public float getPivotX() {
        return this.f4066d;
    }

    public float getPivotY() {
        return this.f4067e;
    }

    public float getRotation() {
        return this.f4065c;
    }

    public float getScaleX() {
        return this.f4068f;
    }

    public float getScaleY() {
        return this.f4069g;
    }

    public float getTranslateX() {
        return this.f4070h;
    }

    public float getTranslateY() {
        return this.f4071i;
    }

    public void setPivotX(float f11) {
        if (f11 != this.f4066d) {
            this.f4066d = f11;
            c();
        }
    }

    public void setPivotY(float f11) {
        if (f11 != this.f4067e) {
            this.f4067e = f11;
            c();
        }
    }

    public void setRotation(float f11) {
        if (f11 != this.f4065c) {
            this.f4065c = f11;
            c();
        }
    }

    public void setScaleX(float f11) {
        if (f11 != this.f4068f) {
            this.f4068f = f11;
            c();
        }
    }

    public void setScaleY(float f11) {
        if (f11 != this.f4069g) {
            this.f4069g = f11;
            c();
        }
    }

    public void setTranslateX(float f11) {
        if (f11 != this.f4070h) {
            this.f4070h = f11;
            c();
        }
    }

    public void setTranslateY(float f11) {
        if (f11 != this.f4071i) {
            this.f4071i = f11;
            c();
        }
    }

    public l() {
        this.f4063a = new Matrix();
        this.f4064b = new ArrayList();
        this.f4065c = 0.0f;
        this.f4066d = 0.0f;
        this.f4067e = 0.0f;
        this.f4068f = 1.0f;
        this.f4069g = 1.0f;
        this.f4070h = 0.0f;
        this.f4071i = 0.0f;
        this.f4072j = new Matrix();
        this.f4073k = null;
    }
}
