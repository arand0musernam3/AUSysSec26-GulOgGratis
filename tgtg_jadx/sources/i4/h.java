package i4;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f23258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f23259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f23260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f23261d;

    public h(Path path) {
        this.f23258a = path;
    }

    public static void a(h hVar, h hVar2) {
        Path path = hVar.f23258a;
        if (hVar2 instanceof h) {
            path.addPath(hVar2.f23258a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
        } else {
            h2.a("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(h hVar, h4.c cVar) {
        p0 p0Var = p0.CounterClockwise;
        hVar.getClass();
        float f11 = cVar.f21380a;
        float f12 = cVar.f21383d;
        float f13 = cVar.f21382c;
        float f14 = cVar.f21381b;
        if (Float.isNaN(f11) || Float.isNaN(f14) || Float.isNaN(f13) || Float.isNaN(f12)) {
            l.c("Invalid rectangle, make sure no value is NaN");
        }
        if (hVar.f23259b == null) {
            hVar.f23259b = new RectF();
        }
        RectF rectF = hVar.f23259b;
        rectF.getClass();
        rectF.set(f11, f14, f13, f12);
        Path path = hVar.f23258a;
        RectF rectF2 = hVar.f23259b;
        rectF2.getClass();
        path.addRect(rectF2, l.b(p0Var));
    }

    public static void c(h hVar, h4.d dVar) {
        p0 p0Var = p0.CounterClockwise;
        if (hVar.f23259b == null) {
            hVar.f23259b = new RectF();
        }
        RectF rectF = hVar.f23259b;
        rectF.getClass();
        float f11 = dVar.f21384a;
        long j9 = dVar.f21391h;
        long j11 = dVar.f21390g;
        long j12 = dVar.f21389f;
        long j13 = dVar.f21388e;
        rectF.set(f11, dVar.f21385b, dVar.f21386c, dVar.f21387d);
        if (hVar.f23260c == null) {
            hVar.f23260c = new float[8];
        }
        float[] fArr = hVar.f23260c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j13 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j13 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j9 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j9 & 4294967295L));
        Path path = hVar.f23258a;
        RectF rectF2 = hVar.f23259b;
        rectF2.getClass();
        float[] fArr2 = hVar.f23260c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, l.b(p0Var));
    }

    public final h4.c d() {
        if (this.f23259b == null) {
            this.f23259b = new RectF();
        }
        RectF rectF = this.f23259b;
        rectF.getClass();
        this.f23258a.computeBounds(rectF, true);
        return new h4.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f11, float f12) {
        this.f23258a.lineTo(f11, f12);
    }

    public final void f(float f11, float f12) {
        this.f23258a.moveTo(f11, f12);
    }

    public final boolean g(h hVar, h hVar2, int i11) {
        Path.Op op2 = i11 == 0 ? Path.Op.DIFFERENCE : i11 == 1 ? Path.Op.INTERSECT : i11 == 4 ? Path.Op.REVERSE_DIFFERENCE : i11 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(hVar instanceof h)) {
            h2.a("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = hVar.f23258a;
        if (hVar2 instanceof h) {
            return this.f23258a.op(path, hVar2.f23258a, op2);
        }
        h2.a("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void h() {
        this.f23258a.reset();
    }

    public final void i(int i11) {
        this.f23258a.setFillType(i11 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void j(long j9) {
        Matrix matrix = this.f23261d;
        if (matrix == null) {
            this.f23261d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.f23261d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)));
        Matrix matrix3 = this.f23261d;
        matrix3.getClass();
        this.f23258a.transform(matrix3);
    }
}
