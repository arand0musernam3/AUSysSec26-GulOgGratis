package bq;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import c6.y;
import com.app.tgtg.model.remote.item.LocalHero;
import com.app.tgtg.model.remote.item.StoreInformation;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f6592b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setOrientation(1);
        setLayoutParams(new RecyclerView.a(-1, -2));
        e eVar = new e(context, null, 6, 0);
        this.f6592b = eVar;
        eVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(eVar);
    }

    @Override // bq.g
    public final void a(StoreInformation storeInformation, y yVar, zp.b bVar) {
        storeInformation.getClass();
        yVar.getClass();
        bVar.getClass();
        LocalHero localHero = storeInformation.getLocalHero();
        String title = localHero != null ? localHero.getTitle() : null;
        if (title == null || StringsKt.H(title)) {
            String description = localHero != null ? localHero.getDescription() : null;
            if (description == null || StringsKt.H(description)) {
                setVisibility(8);
                return;
            }
        }
        setVisibility(0);
        this.f6592b.setLocalHero(localHero);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
