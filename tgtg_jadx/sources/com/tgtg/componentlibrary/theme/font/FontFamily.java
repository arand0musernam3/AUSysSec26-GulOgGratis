package com.tgtg.componentlibrary.theme.font;

import com.app.tgtg.R;
import kotlin.Metadata;
import m0.c;
import nx.d;
import org.jetbrains.annotations.NotNull;
import q5.a0;
import q5.l;
import q5.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tgtg/componentlibrary/theme/font/FontFamily;", "Lcom/tgtg/componentlibrary/theme/font/PantryFontFamily;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FontFamily extends PantryFontFamily {
    public static final int $stable = 0;

    @NotNull
    public static final FontFamily INSTANCE;

    static {
        r rVar = r.l;
        a0 a0VarC = d.c(R.font.tenon_x_bold, rVar, 12);
        a0 a0VarC2 = d.c(R.font.tenon_x_bold_italic, rVar, 8);
        r rVar2 = r.f36046k;
        a0 a0VarC3 = d.c(R.font.tenon_bold, rVar2, 12);
        a0 a0VarC4 = d.c(R.font.tenon_bold_italic, rVar2, 8);
        r rVar3 = r.f36044i;
        a0 a0VarC5 = d.c(R.font.tenon_medium, rVar3, 12);
        a0 a0VarC6 = d.c(R.font.tenon_medium_italic, rVar3, 8);
        r rVar4 = r.f36043h;
        a0 a0VarC7 = d.c(R.font.tenon_regular, rVar4, 12);
        a0 a0VarC8 = d.c(R.font.tenon_regular_italic, rVar4, 8);
        r rVar5 = r.f36042g;
        a0 a0VarC9 = d.c(R.font.tenon_light, rVar5, 12);
        a0 a0VarC10 = d.c(R.font.tenon_light_italic, rVar5, 8);
        r rVar6 = r.f36041f;
        l lVarG = c.G(a0VarC, a0VarC2, a0VarC3, a0VarC4, a0VarC5, a0VarC6, a0VarC7, a0VarC8, a0VarC9, a0VarC10, d.c(R.font.tenon_x_light, rVar6, 12), d.c(R.font.tenon_x_light_italic, rVar6, 8));
        l lVarG2 = c.G(d.c(R.font.korolev_medium, rVar4, 12), d.c(R.font.korolev_heavy, rVar2, 12));
        r rVar7 = r.f36047m;
        a0 a0VarC11 = d.c(R.font.noto_sans_black, rVar7, 12);
        a0 a0VarC12 = d.c(R.font.noto_sans_black_italic, rVar7, 8);
        a0 a0VarC13 = d.c(R.font.noto_sans_extra_bold, rVar, 12);
        a0 a0VarC14 = d.c(R.font.noto_sans_extra_bold_italic, rVar, 8);
        a0 a0VarC15 = d.c(R.font.noto_sans_bold, rVar2, 12);
        a0 a0VarC16 = d.c(R.font.noto_sans_bold_italic, rVar2, 8);
        r rVar8 = r.f36045j;
        a0 a0VarC17 = d.c(R.font.noto_sans_semi_bold, rVar8, 12);
        a0 a0VarC18 = d.c(R.font.noto_sans_semi_bold_italic, rVar8, 8);
        a0 a0VarC19 = d.c(R.font.noto_sans_medium, rVar3, 12);
        a0 a0VarC20 = d.c(R.font.noto_sans_medium_italic, rVar3, 8);
        a0 a0VarC21 = d.c(R.font.noto_sans_regular, rVar4, 12);
        a0 a0VarC22 = d.c(R.font.noto_sans_italic, rVar4, 8);
        a0 a0VarC23 = d.c(R.font.noto_sans_light, rVar5, 12);
        a0 a0VarC24 = d.c(R.font.noto_sans_light_italic, rVar5, 8);
        a0 a0VarC25 = d.c(R.font.noto_sans_extra_light, rVar6, 12);
        a0 a0VarC26 = d.c(R.font.noto_sans_extra_light_italic, rVar6, 8);
        r rVar9 = r.f36040e;
        INSTANCE = new FontFamily(lVarG, lVarG2, c.G(a0VarC11, a0VarC12, a0VarC13, a0VarC14, a0VarC15, a0VarC16, a0VarC17, a0VarC18, a0VarC19, a0VarC20, a0VarC21, a0VarC22, a0VarC23, a0VarC24, a0VarC25, a0VarC26, d.c(R.font.noto_sans_thin, rVar9, 12), d.c(R.font.noto_sans_thin_italic, rVar9, 8)), null);
    }
}
