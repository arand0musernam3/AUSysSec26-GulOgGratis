package com.tgtg.componentlibrary.component.p000switch;

import b2.k;
import b4.t;
import b5.h1;
import b5.m;
import c5.l3;
import c5.o2;
import com.braze.Constants;
import com.tgtg.componentlibrary.component.p000switch.model.SwitchGeometry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t1.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0082\b\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000287B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001e¨\u00069"}, d2 = {"Lcom/tgtg/componentlibrary/component/switch/ThumbElement;", "Lb5/h1;", "Lcom/tgtg/componentlibrary/component/switch/ThumbNode;", "Lb2/k;", "interactionSource", "Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;", "switchGeometry", "Lt1/x;", "", "animationSpec", "", "checked", "<init>", "(Lb2/k;Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;Lt1/x;Z)V", "create", "()Lcom/tgtg/componentlibrary/component/switch/ThumbNode;", "node", "", "update", "(Lcom/tgtg/componentlibrary/component/switch/ThumbNode;)V", "Lc5/o2;", "inspectableProperties", "(Lc5/o2;)V", "component1", "()Lb2/k;", "component2", "()Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;", "component3", "()Lt1/x;", "component4", "()Z", "copy", "(Lb2/k;Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;Lt1/x;Z)Lcom/tgtg/componentlibrary/component/switch/ThumbElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lb2/k;", "getInteractionSource", "c", "Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;", "getSwitchGeometry", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Lt1/x;", "getAnimationSpec", "e", "Z", "getChecked", "Companion", "UpdateBehaviour", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class ThumbElement extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final k interactionSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final SwitchGeometry switchGeometry;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final x animationSpec;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean checked;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/tgtg/componentlibrary/component/switch/ThumbElement$UpdateBehaviour;", "", "update", "", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface UpdateBehaviour {
        void update();
    }

    public ThumbElement(@NotNull k kVar, @NotNull SwitchGeometry switchGeometry, @NotNull x xVar, boolean z11) {
        kVar.getClass();
        switchGeometry.getClass();
        xVar.getClass();
        this.interactionSource = kVar;
        this.switchGeometry = switchGeometry;
        this.animationSpec = xVar;
        this.checked = z11;
    }

    public static /* synthetic */ ThumbElement copy$default(ThumbElement thumbElement, k kVar, SwitchGeometry switchGeometry, x xVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = thumbElement.interactionSource;
        }
        if ((i11 & 2) != 0) {
            switchGeometry = thumbElement.switchGeometry;
        }
        if ((i11 & 4) != 0) {
            xVar = thumbElement.animationSpec;
        }
        if ((i11 & 8) != 0) {
            z11 = thumbElement.checked;
        }
        return thumbElement.copy(kVar, switchGeometry, xVar, z11);
    }

    @Override // b4.r, b4.t
    public /* bridge */ /* synthetic */ boolean all(@NotNull Function1 function1) {
        return super.all(function1);
    }

    public boolean any(@NotNull Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final k getInteractionSource() {
        return this.interactionSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SwitchGeometry getSwitchGeometry() {
        return this.switchGeometry;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final x getAnimationSpec() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final ThumbElement copy(@NotNull k interactionSource, @NotNull SwitchGeometry switchGeometry, @NotNull x animationSpec, boolean checked) {
        interactionSource.getClass();
        switchGeometry.getClass();
        animationSpec.getClass();
        return new ThumbElement(interactionSource, switchGeometry, animationSpec, checked);
    }

    @Override // b5.h1
    @NotNull
    public ThumbNode create() {
        return new ThumbNode(this.interactionSource, this.switchGeometry, this.checked, this.animationSpec);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) other;
        return Intrinsics.areEqual(this.interactionSource, thumbElement.interactionSource) && Intrinsics.areEqual(this.switchGeometry, thumbElement.switchGeometry) && Intrinsics.areEqual(this.animationSpec, thumbElement.animationSpec) && this.checked == thumbElement.checked;
    }

    @Override // b4.r, b4.t
    public Object foldIn(Object obj, @NotNull Function2 function2) {
        return function2.invoke(obj, this);
    }

    public Object foldOut(Object obj, @NotNull Function2 function2) {
        return function2.invoke(this, obj);
    }

    @NotNull
    public final x getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final k getInteractionSource() {
        return this.interactionSource;
    }

    @NotNull
    public final SwitchGeometry getSwitchGeometry() {
        return this.switchGeometry;
    }

    public int hashCode() {
        return Boolean.hashCode(this.checked) + ((this.animationSpec.hashCode() + ((this.switchGeometry.hashCode() + (this.interactionSource.hashCode() * 31)) * 31)) * 31);
    }

    @Override // b5.h1
    public void inspectableProperties(@NotNull o2 o2Var) {
        o2Var.getClass();
        o2Var.f7307a = "switchThumb";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(this.switchGeometry, "switchGeometry");
        l3Var.b(this.interactionSource, "interactionSource");
        l3Var.b(Boolean.valueOf(this.checked), "checked");
        l3Var.b(this.animationSpec, "animationSpec");
    }

    @Override // b4.t
    @NotNull
    public /* bridge */ /* synthetic */ t then(@NotNull t tVar) {
        return super.then(tVar);
    }

    @NotNull
    public String toString() {
        return "ThumbElement(interactionSource=" + this.interactionSource + ", switchGeometry=" + this.switchGeometry + ", animationSpec=" + this.animationSpec + ", checked=" + this.checked + ")";
    }

    @Override // b5.h1
    public void update(@NotNull ThumbNode node) {
        node.getClass();
        node.setInteractionSource(this.interactionSource);
        boolean checked = node.getChecked();
        boolean z11 = this.checked;
        if (checked != z11) {
            m.g(node).F();
        }
        node.setChecked(z11);
        node.setAnimationSpec(this.animationSpec);
        node.update();
    }
}
