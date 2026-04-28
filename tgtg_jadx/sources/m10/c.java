package m10;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.app.tgtg.R;
import e20.i0;
import h0.g;
import j20.d;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f28746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f28747b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f28749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f28750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f28751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f28752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f28753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f28756k;
    public int l;

    public c(Context context, b bVar) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        bVar = bVar == null ? new b() : bVar;
        int i11 = bVar.f28721a;
        if (i11 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i11);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e5) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i11));
                notFoundException.initCause(e5);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayM = i0.m(context, attributeSetAsAttributeSet, j10.a.f24407c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f28748c = typedArrayM.getDimensionPixelSize(5, -1);
        this.f28754i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f28755j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f28749d = typedArrayM.getDimensionPixelSize(15, -1);
        this.f28750e = typedArrayM.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.f28752g = typedArrayM.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f28751f = typedArrayM.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.f28753h = typedArrayM.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f28756k = typedArrayM.getInt(25, 1);
        this.l = typedArrayM.getInt(2, 0);
        b bVar2 = this.f28747b;
        int i12 = bVar.f28729i;
        bVar2.f28729i = i12 == -2 ? 255 : i12;
        int i13 = bVar.f28731k;
        if (i13 != -2) {
            bVar2.f28731k = i13;
        } else {
            boolean zHasValue = typedArrayM.hasValue(24);
            b bVar3 = this.f28747b;
            if (zHasValue) {
                bVar3.f28731k = typedArrayM.getInt(24, 0);
            } else {
                bVar3.f28731k = -1;
            }
        }
        String str = bVar.f28730j;
        if (str != null) {
            this.f28747b.f28730j = str;
        } else if (typedArrayM.hasValue(8)) {
            this.f28747b.f28730j = typedArrayM.getString(8);
        }
        b bVar4 = this.f28747b;
        bVar4.f28734o = bVar.f28734o;
        CharSequence charSequence = bVar.f28735p;
        bVar4.f28735p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar5 = this.f28747b;
        int i14 = bVar.f28736q;
        bVar5.f28736q = i14 == 0 ? R.plurals.mtrl_badge_content_description : i14;
        int i15 = bVar.f28737r;
        bVar5.f28737r = i15 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i15;
        Boolean bool = bVar.f28739t;
        bVar5.f28739t = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar6 = this.f28747b;
        int i16 = bVar.l;
        bVar6.l = i16 == -2 ? typedArrayM.getInt(22, -2) : i16;
        b bVar7 = this.f28747b;
        int i17 = bVar.f28732m;
        bVar7.f28732m = i17 == -2 ? typedArrayM.getInt(23, -2) : i17;
        b bVar8 = this.f28747b;
        Integer num = bVar.f28725e;
        bVar8.f28725e = Integer.valueOf(num == null ? typedArrayM.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        b bVar9 = this.f28747b;
        Integer num2 = bVar.f28726f;
        bVar9.f28726f = Integer.valueOf(num2 == null ? typedArrayM.getResourceId(7, 0) : num2.intValue());
        b bVar10 = this.f28747b;
        Integer num3 = bVar.f28727g;
        bVar10.f28727g = Integer.valueOf(num3 == null ? typedArrayM.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        b bVar11 = this.f28747b;
        Integer num4 = bVar.f28728h;
        bVar11.f28728h = Integer.valueOf(num4 == null ? typedArrayM.getResourceId(17, 0) : num4.intValue());
        b bVar12 = this.f28747b;
        Integer num5 = bVar.f28722b;
        bVar12.f28722b = Integer.valueOf(num5 == null ? g.p(context, typedArrayM, 1).getDefaultColor() : num5.intValue());
        b bVar13 = this.f28747b;
        Integer num6 = bVar.f28724d;
        bVar13.f28724d = Integer.valueOf(num6 == null ? typedArrayM.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = bVar.f28723c;
        if (num7 != null) {
            this.f28747b.f28723c = num7;
        } else {
            boolean zHasValue2 = typedArrayM.hasValue(10);
            b bVar14 = this.f28747b;
            if (zHasValue2) {
                bVar14.f28723c = Integer.valueOf(g.p(context, typedArrayM, 10).getDefaultColor());
            } else {
                this.f28747b.f28723c = Integer.valueOf(new d(context, bVar14.f28724d.intValue()).f24466k.getDefaultColor());
            }
        }
        b bVar15 = this.f28747b;
        Integer num8 = bVar.f28738s;
        bVar15.f28738s = Integer.valueOf(num8 == null ? typedArrayM.getInt(3, 8388661) : num8.intValue());
        b bVar16 = this.f28747b;
        Integer num9 = bVar.f28740u;
        bVar16.f28740u = Integer.valueOf(num9 == null ? typedArrayM.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        b bVar17 = this.f28747b;
        Integer num10 = bVar.f28741v;
        bVar17.f28741v = Integer.valueOf(num10 == null ? typedArrayM.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        b bVar18 = this.f28747b;
        Integer num11 = bVar.f28742w;
        bVar18.f28742w = Integer.valueOf(num11 == null ? typedArrayM.getDimensionPixelOffset(19, 0) : num11.intValue());
        b bVar19 = this.f28747b;
        Integer num12 = bVar.f28743x;
        bVar19.f28743x = Integer.valueOf(num12 == null ? typedArrayM.getDimensionPixelOffset(26, 0) : num12.intValue());
        b bVar20 = this.f28747b;
        Integer num13 = bVar.f28744y;
        bVar20.f28744y = Integer.valueOf(num13 == null ? typedArrayM.getDimensionPixelOffset(20, bVar20.f28742w.intValue()) : num13.intValue());
        b bVar21 = this.f28747b;
        Integer num14 = bVar.f28745z;
        bVar21.f28745z = Integer.valueOf(num14 == null ? typedArrayM.getDimensionPixelOffset(27, bVar21.f28743x.intValue()) : num14.intValue());
        b bVar22 = this.f28747b;
        Integer num15 = bVar.C;
        bVar22.C = Integer.valueOf(num15 == null ? typedArrayM.getDimensionPixelOffset(21, 0) : num15.intValue());
        b bVar23 = this.f28747b;
        Integer num16 = bVar.A;
        bVar23.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar24 = this.f28747b;
        Integer num17 = bVar.B;
        bVar24.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar25 = this.f28747b;
        Boolean bool2 = bVar.D;
        bVar25.D = Boolean.valueOf(bool2 == null ? typedArrayM.getBoolean(0, false) : bool2.booleanValue());
        typedArrayM.recycle();
        Locale locale = bVar.f28733n;
        b bVar26 = this.f28747b;
        if (locale == null) {
            bVar26.f28733n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            bVar26.f28733n = locale;
        }
        this.f28746a = bVar;
    }
}
