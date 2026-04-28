package zendesk.android;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o30.e0;
import x70.c;
import x80.t;
import x80.u;
import z70.e;
import z70.i;
import zendesk.android.events.ZendeskEvent;
import zendesk.android.events.ZendeskEventListener;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.ZendeskExtensions$eventFlow$1", f = "ZendeskExtensions.kt", l = {24}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx80/u;", "Lzendesk/android/events/ZendeskEvent;", "", "<anonymous>", "(Lx80/u;)V"}, k = 3, mv = {2, 1, 0})
public final class ZendeskExtensions$eventFlow$1 extends i implements Function2<u, c<? super Unit>, Object> {
    final /* synthetic */ Zendesk $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskExtensions$eventFlow$1(Zendesk zendesk2, c<? super ZendeskExtensions$eventFlow$1> cVar) {
        super(2, cVar);
        this.$this_eventFlow = zendesk2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(u uVar, ZendeskEvent zendeskEvent) {
        ((t) uVar).h(zendeskEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Zendesk zendesk2, ZendeskEventListener zendeskEventListener) {
        zendesk2.removeEventListener(zendeskEventListener);
        return Unit.f26487a;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        ZendeskExtensions$eventFlow$1 zendeskExtensions$eventFlow$1 = new ZendeskExtensions$eventFlow$1(this.$this_eventFlow, cVar);
        zendeskExtensions$eventFlow$1.L$0 = obj;
        return zendeskExtensions$eventFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u uVar, c<? super Unit> cVar) {
        return ((ZendeskExtensions$eventFlow$1) create(uVar, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [zendesk.android.a, zendesk.android.events.ZendeskEventListener] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            g.M(obj);
            final u uVar = (u) this.L$0;
            final ?? r12 = new ZendeskEventListener() { // from class: zendesk.android.a
                @Override // zendesk.android.events.ZendeskEventListener
                public final void onEvent(ZendeskEvent zendeskEvent) {
                    ZendeskExtensions$eventFlow$1.invokeSuspend$lambda$0(uVar, zendeskEvent);
                }
            };
            this.$this_eventFlow.addEventListener(r12);
            final Zendesk zendesk2 = this.$this_eventFlow;
            Function0 function0 = new Function0() { // from class: zendesk.android.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZendeskExtensions$eventFlow$1.invokeSuspend$lambda$1(zendesk2, r12);
                }
            };
            this.label = 1;
            if (e0.p(uVar, function0, this) == aVar) {
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
