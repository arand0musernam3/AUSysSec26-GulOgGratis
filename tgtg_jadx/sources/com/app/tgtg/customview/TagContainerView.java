package com.app.tgtg.customview;

import a3.f1;
import android.content.Context;
import android.util.AttributeSet;
import bg.m;
import c5.a;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.i;
import m3.k1;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class TagContainerView extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8924j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f8925i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f8925i = i.w(n0.f26529a);
    }

    @Override // c5.a
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-376138438);
        int i12 = (sVar.f(this) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            m.d(null, getTags(), null, sVar, 0, 5);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f1(this, i11, 10);
        }
    }

    @NotNull
    public final List<ItemTagInfo> getTags() {
        return (List) this.f8925i.getValue();
    }

    public final void setTags(@NotNull List<ItemTagInfo> list) {
        list.getClass();
        this.f8925i.setValue(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TagContainerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ TagContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
