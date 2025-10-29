package service

type Node struct {
	ID    string `json:"id"`
	Label string `json:"label"`
}
type Edge struct {
	From string `json:"from"`
	To   string `json:"to"`
}

type MindMap struct {
	Nodes []Node `json:"nodes"`
	Edges []Edge `json:"edges"`
}

// 占位：从 Markdown 粗略提取 3~4 个主题节点
func GenerateMindMap(markdown string) (*MindMap, error) {
	m := &MindMap{Nodes: []Node{{ID: "n1", Label: "主题"}, {ID: "n2", Label: "要点"}, {ID: "n3", Label: "术语"}}, Edges: []Edge{{From: "n1", To: "n2"}, {From: "n1", To: "n3"}}}
	return m, nil
}
