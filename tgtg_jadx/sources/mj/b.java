package mj;

import a3.d2;
import android.graphics.RectF;
import android.util.Rational;
import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import java.io.Serializable;
import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29968a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f29970c;

    public b(Rational rational, Rational rational2) {
        this.f29970c = rational2 == null ? new Rational(4, 3) : rational2;
        this.f29969b = b(rational);
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public RectF b(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = (Rational) this.f29970c;
        return fFloatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f29968a) {
            case 0:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f29970c;
                int iCompare = ((d2) this.f29969b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                Integer num = (Integer) linkedHashMap.get((FilterChipOption) obj);
                if (num == null) {
                    num = num;
                }
                Integer num2 = (Integer) linkedHashMap.get((FilterChipOption) obj2);
                return w70.a.a(num, num2 != null ? num2 : 0);
            default:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                RectF rectF = (RectF) this.f29969b;
                boolean z11 = false;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF rectFB = b(rational);
                RectF rectFB2 = b(rational2);
                boolean z12 = rectFB.width() >= rectF.width() && rectFB.height() >= rectF.height();
                if (rectFB2.width() >= rectF.width() && rectFB2.height() >= rectF.height()) {
                    z11 = true;
                }
                if (z12 && z11) {
                    return (int) Math.signum((rectFB.height() * rectFB.width()) - (rectFB2.height() * rectFB2.width()));
                }
                if (z12) {
                    return -1;
                }
                if (z11) {
                    return 1;
                }
                return -((int) Math.signum(a(rectFB, rectF) - a(rectFB2, rectF)));
        }
    }

    public b(d2 d2Var, LinkedHashMap linkedHashMap) {
        this.f29969b = d2Var;
        this.f29970c = linkedHashMap;
    }
}
