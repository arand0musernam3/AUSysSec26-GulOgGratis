package bq;

import a3.f1;
import android.content.Context;
import android.util.AttributeSet;
import com.app.tgtg.model.remote.item.LocalHero;
import kotlin.text.StringsKt;
import m3.k1;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends c5.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f6590j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f6591i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f6591i = m3.i.w(null);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        String title;
        String description;
        s sVar = (s) nVar;
        sVar.c0(595126066);
        int i12 = (sVar.f(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            LocalHero localHero = getLocalHero();
            if (localHero == null || (title = localHero.getTitle()) == null || StringsKt.H(title) || (description = localHero.getDescription()) == null || StringsKt.H(description)) {
                sVar.a0(-224173232);
                sVar.q(false);
            } else {
                sVar.a0(-224224165);
                ox.h.e(localHero, sVar, 0);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f1(this, i11, 11);
        }
    }

    @Nullable
    public final LocalHero getLocalHero() {
        return (LocalHero) this.f6591i.getValue();
    }

    public final void setLocalHero(@Nullable LocalHero localHero) {
        this.f6591i.setValue(localHero);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }
}
