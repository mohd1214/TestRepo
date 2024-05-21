const util = require('util')

step_template = {
    "branchId": "WFX",
    "name": "SX",
    "label": "LABEL",
    "type": "manual",
    "level": null,
    "target": [
        {
            "id": -1
        }
    ],
    "isSkipable": true,
    "isActive": true,
    "role": "ROLE",
    "staticInbox": [
        {
            "type": "CUSTOM",
            "isSelected": false
        },
        {
            "type": "ST",
            "isSelected": false
        },
        {
            "type": "RF",
            "isSelected": false
        }
    ],
    "slaActions": [
        {
            "label": "Auto Approve",
            "id": "approve",
            "isSelected": false
        },
        {
            "label": "Auto Reject",
            "id": "reject",
            "isSelected": false
        }
    ]
}
decision_template = {
    "branchId": "WFX",
    "name": "SX",
    "label": "Label",
    "type": "decision",
    "level": null,
    "isSkipable": false,
    "isActive": null,
    "role": null,
    "decisionOptions": [],
    "decisionId": -1
}

start_template = {
    "branchId": "WF1",
    "name": "S1",
    "label": "Start",
    "type": "start",
    "level": null,
    "target": [
        {
            "id": 2
        }
    ],
    "isSkipable": false,
    "isActive": true,
    "role": null
}

end_template = {
    "branchId": "WFX",
    "name": "SX",
    "label": "End",
    "type": "end",
    "level": null,
    "target": null,
    "isSkipable": false,
    "isActive": true,
    "role": null,
    "processType": null
}
//######################################################################################

wf_desc = [
    {
        "type": "steps",
        "branchId": "WF1",
        "steps": [{ "role": "Test", "label": "Test Label" }, { "role": "Test1", "label": "Test Label 1" }, { "role": "Test2", "label": "Test Label 2" }]
    },
    {
        "type": "decision",
        "decisionId": 1,
        "branchId": "WF1",
        "decisionLabel": "Is HR?",
        "isActive": false,
        "decisionOptions": [
            {
                "label": "Yes",
                "hardcoded": "false",
                "branchId": "WF2"
            },
            {
                "label": "No",
                "hardcoded": "false",
                "branchId": "WF3",
            }
        ]
    },
    {
        "type": "steps",
        "branchId": "WF2",
        "steps": [{ "role": "Test3", "label": "Test Label 3" }, { "role": "Test4", "label": "Test Label 4" }, { "role": "Test5", "label": "Test Label 5" }]
    },
    {
        "type": "steps",
        "branchId": "WF3",
        "steps": [{ "role": "end", "label": "End" }],
    }
]

final_steps_arr = [start_template]
var id = 2;
var new_step = null;
var wf_id_tracker = {}
for(let i = 0;i<wf_desc.length;i++){
    if(wf_desc[i].type == "steps"){
        for(let j = 0;j<wf_desc[i].steps.length;j++){
            if(j == 0){
                wf_id_tracker[wf_desc[i].branchId] = id;
            }
            if(wf_desc[i].steps[j].role == "end"){
                new_step = structuredClone(end_template);
                new_step.branchId = wf_desc[i].branchId;
                new_step.name = "S"+id;
                final_steps_arr.push(structuredClone(new_step));
            }else{
                new_step = structuredClone(step_template);
                new_step.branchId = wf_desc[i].branchId;
                new_step.name = "S"+id;
                id++;
                new_step.role = wf_desc[i].steps[j].role;
                new_step.label = wf_desc[i].steps[j].label;
                new_step.target[0].id = id;
                final_steps_arr.push(structuredClone(new_step));
            }
            
        }
    }
    if(wf_desc[i].type == "decision"){
        new_step = structuredClone(decision_template);
            new_step.branchId = wf_desc[i].branchId;
            new_step.name = "S"+id;
            id++;
            new_step.decisionId = wf_desc[i].decisionId;
            new_step.label = wf_desc[i].decisionLabel;
            new_step.decisionOptions = wf_desc[i].decisionOptions;
            new_step.isActive = wf_desc[i].isActive;
            final_steps_arr.push(structuredClone(new_step));
    }
}

for(let k = 0;k<final_steps_arr.length;k++){
    if(final_steps_arr[k].type == 'decision'){
        for(let l = 0;l<final_steps_arr[k].decisionOptions.length;l++){
            final_steps_arr[k].decisionOptions[l].targetId = wf_id_tracker[final_steps_arr[k].decisionOptions[l].branchId]+"";
        }
    }
}
console.log(JSON.stringify(final_steps_arr));

console.log(wf_id_tracker);