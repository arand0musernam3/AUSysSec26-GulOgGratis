package com.tgtg.componentlibrary.component.p000switch;

import b2.k;
import b2.m;
import b2.n;
import b2.o;
import b4.s;
import b5.c0;
import ba0.g;
import com.braze.Constants;
import com.braze.h2;
import com.tgtg.componentlibrary.component.p000switch.ThumbElement;
import com.tgtg.componentlibrary.component.p000switch.model.SwitchGeometry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.jetbrains.annotations.NotNull;
import t1.b;
import t1.x;
import v80.b0;
import v80.f0;
import x70.c;
import y70.a;
import y80.j;
import z4.l1;
import z4.m1;
import z4.t;
import z4.t0;
import z4.u;
import z4.v0;
import z4.w0;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u001a\u001a\u00020\u0017*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00103\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010)¨\u00064"}, d2 = {"Lcom/tgtg/componentlibrary/component/switch/ThumbNode;", "Lb4/s;", "Lb5/c0;", "Lcom/tgtg/componentlibrary/component/switch/ThumbElement$UpdateBehaviour;", "Lb2/k;", "interactionSource", "Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;", "switchGeometry", "", "checked", "Lt1/x;", "", "animationSpec", "<init>", "(Lb2/k;Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;ZLt1/x;)V", "", "onAttach", "()V", "Lz4/w0;", "Lz4/t0;", "measurable", "Lz5/a;", CryptoServicesPermission.CONSTRAINTS, "Lz4/v0;", "measure-3p2s80s", "(Lz4/w0;Lz4/t0;J)Lz4/v0;", "measure", "update", "o", "Lb2/k;", "getInteractionSource", "()Lb2/k;", "setInteractionSource", "(Lb2/k;)V", Constants.BRAZE_PUSH_PRIORITY_KEY, "Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;", "getSwitchGeometry", "()Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;", "q", "Z", "getChecked", "()Z", "setChecked", "(Z)V", "r", "Lt1/x;", "getAnimationSpec", "()Lt1/x;", "setAnimationSpec", "(Lt1/x;)V", "getShouldAutoInvalidate", "shouldAutoInvalidate", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantrySwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantrySwitch.kt\ncom/tgtg/componentlibrary/component/switch/ThumbNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,518:1\n52#2,9:519\n52#2,7:528\n52#2:535\n*S KotlinDebug\n*F\n+ 1 PantrySwitch.kt\ncom/tgtg/componentlibrary/component/switch/ThumbNode\n*L\n380#1:519,9\n384#1:528,7\n386#1:535\n*E\n"})
final class ThumbNode extends s implements c0, ThumbElement.UpdateBehaviour {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public k interactionSource;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final SwitchGeometry switchGeometry;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean checked;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public x animationSpec;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f13283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f13284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f13285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f13286w;

    /* JADX INFO: renamed from: com.tgtg.componentlibrary.component.switch.ThumbNode$onAttach$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.tgtg.componentlibrary.component.switch.ThumbNode$onAttach$1", f = "PantrySwitch.kt", l = {360}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 3, 0})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f13291j;

        public AnonymousClass1(c cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ThumbNode.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.f13291j;
            if (i11 == 0) {
                g.M(obj);
                final Ref.IntRef intRef = new Ref.IntRef();
                final ThumbNode thumbNode = ThumbNode.this;
                y80.i iVarA = thumbNode.getInteractionSource().a();
                j jVar = new j() { // from class: com.tgtg.componentlibrary.component.switch.ThumbNode.onAttach.1.1
                    public final Object emit(b2.j jVar2, c<? super Unit> cVar) {
                        boolean z11 = jVar2 instanceof n;
                        Ref.IntRef intRef2 = intRef;
                        if (z11) {
                            intRef2.element++;
                        } else if ((jVar2 instanceof o) || (jVar2 instanceof m)) {
                            intRef2.element--;
                        }
                        boolean z12 = intRef2.element > 0;
                        ThumbNode thumbNode2 = thumbNode;
                        if (thumbNode2.f13282s != z12) {
                            thumbNode2.f13282s = z12;
                            b5.m.g(thumbNode2).F();
                        }
                        return Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                        return emit((b2.j) obj2, (c<? super Unit>) cVar);
                    }
                };
                this.f13291j = 1;
                if (iVarA.collect(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    public ThumbNode(@NotNull k kVar, @NotNull SwitchGeometry switchGeometry, boolean z11, @NotNull x xVar) {
        kVar.getClass();
        switchGeometry.getClass();
        xVar.getClass();
        this.interactionSource = kVar;
        this.switchGeometry = switchGeometry;
        this.checked = z11;
        this.animationSpec = xVar;
        this.f13285v = Float.NaN;
        this.f13286w = Float.NaN;
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

    @Override // b4.s
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @NotNull
    public final SwitchGeometry getSwitchGeometry() {
        return this.switchGeometry;
    }

    @Override // b5.c0
    public /* bridge */ int maxIntrinsicHeight(@NotNull u uVar, @NotNull t tVar, int i11) {
        return super.maxIntrinsicHeight(uVar, tVar, i11);
    }

    @Override // b5.c0
    public /* bridge */ int maxIntrinsicWidth(@NotNull u uVar, @NotNull t tVar, int i11) {
        return super.maxIntrinsicWidth(uVar, tVar, i11);
    }

    @Override // b5.c0
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public v0 mo58measure3p2s80s(@NotNull w0 w0Var, @NotNull t0 t0Var, long j9) {
        w0Var.getClass();
        t0Var.getClass();
        SwitchGeometry switchGeometry = this.switchGeometry;
        float fC0 = w0Var.c0(switchGeometry.getThumbGeometry().m953getThumbDiameterD9Ej5fM());
        float fM946getTrackHeightD9Ej5fM = (switchGeometry.m946getTrackHeightD9Ej5fM() - switchGeometry.getThumbGeometry().m953getThumbDiameterD9Ej5fM()) / 2;
        b bVar = this.f13284u;
        int iFloatValue = (int) (bVar != null ? ((Number) bVar.d()).floatValue() : fC0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            z5.i.a("width and height must be >= 0");
        }
        final m1 m1VarD = t0Var.D(z5.b.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        final float fC02 = w0Var.c0((switchGeometry.m946getTrackHeightD9Ej5fM() - w0Var.R(fC0)) / 2.0f);
        float fC03 = w0Var.c0((switchGeometry.m949getTrackWidthD9Ej5fM() - switchGeometry.getThumbGeometry().m953getThumbDiameterD9Ej5fM()) - fM946getTrackHeightD9Ej5fM);
        boolean z11 = this.f13282s;
        if (z11 && this.checked) {
            fC02 = fC03 - w0Var.c0(switchGeometry.m948getTrackOutlineWidthD9Ej5fM());
        } else if (z11 && !this.checked) {
            fC02 = w0Var.c0(switchGeometry.m948getTrackOutlineWidthD9Ej5fM());
        } else if (this.checked) {
            fC02 = fC03;
        }
        f0.B(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, fC0, null), 3);
        b bVar2 = this.f13283t;
        if (!Intrinsics.areEqual(bVar2 != null ? (Float) bVar2.f39361e.getValue() : null, fC02)) {
            f0.B(getCoroutineScope(), null, null, new ThumbNode$measure$2(this, fC02, null), 3);
        }
        if (Float.isNaN(this.f13286w) && Float.isNaN(this.f13285v)) {
            this.f13286w = fC0;
            this.f13285v = fC02;
        }
        return w0.f(w0Var, iFloatValue, iFloatValue, new Function1() { // from class: com.tgtg.componentlibrary.component.switch.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                l1 l1Var = (l1) obj;
                l1Var.getClass();
                b bVar3 = this.f13283t;
                l1.o(l1Var, m1VarD, (int) (bVar3 != null ? ((Number) bVar3.d()).floatValue() : fC02), 0);
                return Unit.f26487a;
            }
        });
    }

    @Override // b5.c0
    public /* bridge */ int minIntrinsicHeight(@NotNull u uVar, @NotNull t tVar, int i11) {
        return super.minIntrinsicHeight(uVar, tVar, i11);
    }

    @Override // b5.c0
    public /* bridge */ int minIntrinsicWidth(@NotNull u uVar, @NotNull t tVar, int i11) {
        return super.minIntrinsicWidth(uVar, tVar, i11);
    }

    @Override // b4.s
    public void onAttach() {
        f0.B(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
    }

    public final void setAnimationSpec(@NotNull x xVar) {
        xVar.getClass();
        this.animationSpec = xVar;
    }

    public final void setChecked(boolean z11) {
        this.checked = z11;
    }

    public final void setInteractionSource(@NotNull k kVar) {
        kVar.getClass();
        this.interactionSource = kVar;
    }

    @Override // com.tgtg.componentlibrary.component.switch.ThumbElement.UpdateBehaviour
    public void update() {
        if (this.f13284u == null && !Float.isNaN(this.f13286w)) {
            this.f13284u = t1.c.a(this.f13286w);
        }
        if (this.f13283t != null || Float.isNaN(this.f13285v)) {
            return;
        }
        this.f13283t = t1.c.a(this.f13285v);
    }

    @Override // b5.l, b5.i2
    public /* bridge */ /* synthetic */ void onDensityChange() {
    }

    @Override // b5.l
    public /* bridge */ /* synthetic */ void onLayoutDirectionChange() {
    }
}
