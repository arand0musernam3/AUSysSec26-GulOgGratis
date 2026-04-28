package n20;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.app.tgtg.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f30306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f30307c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d[] f30308d = new d[10];

    public static f0 b(d dVar) {
        f0 f0Var = new f0();
        f0Var.a(StateSet.WILD_CARD, dVar);
        return f0Var;
    }

    public final void a(int[] iArr, d dVar) {
        int i11 = this.f30305a;
        if (i11 == 0 || iArr.length == 0) {
            this.f30306b = dVar;
        }
        int[][] iArr2 = this.f30307c;
        if (i11 >= iArr2.length) {
            int i12 = i11 + 10;
            int[][] iArr3 = new int[i12][];
            System.arraycopy(iArr2, 0, iArr3, 0, i11);
            this.f30307c = iArr3;
            d[] dVarArr = new d[i12];
            System.arraycopy(this.f30308d, 0, dVarArr, 0, i11);
            this.f30308d = dVarArr;
        }
        int[][] iArr4 = this.f30307c;
        int i13 = this.f30305a;
        iArr4[i13] = iArr;
        this.f30308d[i13] = dVar;
        this.f30305a = i13 + 1;
    }

    public final d c(int[] iArr) {
        int i11;
        int[][] iArr2 = this.f30307c;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = -1;
            if (i13 >= this.f30305a) {
                i13 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i13], iArr)) {
                break;
            }
            i13++;
        }
        if (i13 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f30307c;
            while (true) {
                if (i12 >= this.f30305a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i12], iArr3)) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            i13 = i11;
        }
        return i13 < 0 ? this.f30306b : this.f30308d[i13];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = j10.a.T;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d dVarE = o.e(typedArrayObtainAttributes, 5, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i11 = 0;
                for (int i12 = 0; i12 < attributeCount; i12++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i12);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i13 = i11 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i11] = attributeNameResource;
                        i11 = i13;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i11), dVarE);
            }
        }
    }
}
