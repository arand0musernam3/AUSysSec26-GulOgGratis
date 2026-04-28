package b5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends b4.s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f5891o = t1.f(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b4.s f5892p;

    public final void L0(l lVar) {
        b4.s node = lVar.getNode();
        if (node != lVar) {
            b4.s sVar = lVar instanceof b4.s ? (b4.s) lVar : null;
            b4.s parent$ui = sVar != null ? sVar.getParent$ui() : null;
            if (node == getNode() && Intrinsics.areEqual(parent$ui, this)) {
                return;
            }
            com.braze.h2.b("Cannot delegate to an already delegated node");
            return;
        }
        if (node.isAttached()) {
            y4.a.b("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui(getNode());
        int kindSet$ui = getKindSet$ui();
        int iG = t1.g(node);
        node.setKindSet$ui(iG);
        int kindSet$ui2 = getKindSet$ui();
        int i11 = iG & 2;
        if (i11 != 0 && (kindSet$ui2 & 2) != 0 && !(this instanceof c0)) {
            y4.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
        }
        node.setChild$ui(this.f5892p);
        this.f5892p = node;
        node.setParent$ui(this);
        N0(iG | getKindSet$ui(), false);
        if (isAttached()) {
            if (i11 == 0 || (kindSet$ui & 2) != 0) {
                updateCoordinator$ui(getCoordinator$ui());
            } else {
                l1 l1Var = m.g(this).G;
                getNode().updateCoordinator$ui(null);
                l1Var.g();
            }
            node.markAsAttached$ui();
            node.runAttachLifecycle$ui();
            t1.a(node);
        }
    }

    public final void M0(l lVar) {
        b4.s sVar = null;
        for (b4.s child$ui = this.f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
            if (child$ui == lVar) {
                if (child$ui.isAttached()) {
                    q1.n0 n0Var = t1.f5987a;
                    if (!child$ui.isAttached()) {
                        y4.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    t1.b(child$ui, -1, 2);
                    child$ui.runDetachLifecycle$ui();
                    child$ui.markAsDetached$ui();
                }
                child$ui.setAsDelegateTo$ui(child$ui);
                child$ui.setAggregateChildKindSet$ui(0);
                if (sVar == null) {
                    this.f5892p = child$ui.getChild$ui();
                } else {
                    sVar.setChild$ui(child$ui.getChild$ui());
                }
                child$ui.setChild$ui(null);
                child$ui.setParent$ui(null);
                int kindSet$ui = getKindSet$ui();
                int iG = t1.g(this);
                N0(iG, true);
                if (isAttached() && (kindSet$ui & 2) != 0 && (iG & 2) == 0) {
                    l1 l1Var = m.g(this).G;
                    getNode().updateCoordinator$ui(null);
                    l1Var.g();
                    return;
                }
                return;
            }
            sVar = child$ui;
        }
        org.bouncycastle.jce.provider.a.p(lVar, "Could not find delegate: ");
    }

    public final void N0(int i11, boolean z11) {
        b4.s child$ui;
        int kindSet$ui = getKindSet$ui();
        setKindSet$ui(i11);
        if (kindSet$ui != i11) {
            if (getNode() == this) {
                setAggregateChildKindSet$ui(i11);
            }
            if (isAttached()) {
                b4.s node = getNode();
                b4.s parent$ui = this;
                while (parent$ui != null) {
                    i11 |= parent$ui.getKindSet$ui();
                    parent$ui.setKindSet$ui(i11);
                    if (parent$ui == node) {
                        break;
                    } else {
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                if (z11 && parent$ui == node) {
                    i11 = t1.g(node);
                    node.setKindSet$ui(i11);
                }
                int aggregateChildKindSet$ui = i11 | ((parent$ui == null || (child$ui = parent$ui.getChild$ui()) == null) ? 0 : child$ui.getAggregateChildKindSet$ui());
                while (parent$ui != null) {
                    aggregateChildKindSet$ui |= parent$ui.getKindSet$ui();
                    parent$ui.setAggregateChildKindSet$ui(aggregateChildKindSet$ui);
                    parent$ui = parent$ui.getParent$ui();
                }
            }
        }
    }

    @Override // b4.s
    public final void markAsAttached$ui() {
        super.markAsAttached$ui();
        for (b4.s child$ui = this.f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
            child$ui.updateCoordinator$ui(getCoordinator$ui());
            if (!child$ui.isAttached()) {
                child$ui.markAsAttached$ui();
            }
        }
    }

    @Override // b4.s
    public final void markAsDetached$ui() {
        for (b4.s child$ui = this.f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
            child$ui.markAsDetached$ui();
        }
        super.markAsDetached$ui();
    }

    @Override // b4.s
    public final void reset$ui() {
        super.reset$ui();
        for (b4.s child$ui = this.f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
            child$ui.reset$ui();
        }
    }

    @Override // b4.s
    public final void runAttachLifecycle$ui() {
        for (b4.s child$ui = this.f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
            child$ui.runAttachLifecycle$ui();
        }
        super.runAttachLifecycle$ui();
    }

    @Override // b4.s
    public final void runDetachLifecycle$ui() {
        super.runDetachLifecycle$ui();
        for (b4.s child$ui = this.f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
            child$ui.runDetachLifecycle$ui();
        }
    }

    @Override // b4.s
    public final void setAsDelegateTo$ui(b4.s sVar) {
        super.setAsDelegateTo$ui(sVar);
        for (b4.s child$ui = this.f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
            child$ui.setAsDelegateTo$ui(sVar);
        }
    }

    @Override // b4.s
    public final void updateCoordinator$ui(s1 s1Var) {
        super.updateCoordinator$ui(s1Var);
        for (b4.s child$ui = this.f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
            child$ui.updateCoordinator$ui(s1Var);
        }
    }
}
